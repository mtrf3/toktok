package com.bytedance.librarian;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public class LibrarianUnsatisfiedLinkError extends UnsatisfiedLinkError {
    public static final ArrayList<LibrarianUnsatisfiedLinkError> LJLIL = new ArrayList<>();
    public static final ArrayList<UnsatisfiedLinkError> LJLILLLLZI = new ArrayList<>();

    public LibrarianUnsatisfiedLinkError(String str) {
        super(str);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = LJLIL;
        synchronized (arrayList) {
            arrayList.add(this);
        }
    }

    public LibrarianUnsatisfiedLinkError(String str, Throwable th) {
        super(str);
        initCause(th);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = LJLIL;
        synchronized (arrayList) {
            arrayList.add(this);
        }
    }
}
