package com.ms.user.dtos;

public class PaginationCriteria {
    private int page;
    private int size;

    // Construtores, getters e setters

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
