package com.bytedance.router.fragment;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public class FragmentOp {
    public boolean immediate;
    public String tag;
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentOp() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentOp(String str) {
        this(str, null, false, 6, 0 == true ? 1 : 0);
    }

    public FragmentOp(String str, String str2) {
        this(str, str2, false, 4, null);
    }

    public final boolean getImmediate() {
        return this.immediate;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setImmediate(boolean z) {
        this.immediate = z;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public FragmentOp(String str, String str2, boolean z) {
        this.url = str;
        this.tag = str2;
        this.immediate = z;
    }

    public /* synthetic */ FragmentOp(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
