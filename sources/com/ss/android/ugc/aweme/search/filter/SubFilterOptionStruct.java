package com.ss.android.ugc.aweme.search.filter;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SubFilterOptionStruct implements Serializable {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public FilterOptionStruct LJLJI;

    @InterfaceC65349Pkn("code")
    public int code;

    @InterfaceC65349Pkn("log_info")
    public Map<String, String> logInfo;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("request_info")
    public Map<String, String> requestInfo;

    public final int getCode() {
        return this.code;
    }

    public final FilterOptionStruct getFilterOptionStruct() {
        return this.LJLJI;
    }

    public final Map<String, String> getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getRequestInfo() {
        return this.requestInfo;
    }

    public final boolean isDefaultOption() {
        return this.LJLIL;
    }

    public final boolean isSelected() {
        return this.LJLILLLLZI;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDefaultOption(boolean z) {
        this.LJLIL = z;
    }

    public final void setFilterOptionStruct(FilterOptionStruct filterOptionStruct) {
        this.LJLJI = filterOptionStruct;
    }

    public final void setLogInfo(Map<String, String> map) {
        this.logInfo = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestInfo(Map<String, String> map) {
        this.requestInfo = map;
    }

    public final void setSelected(boolean z) {
        this.LJLILLLLZI = z;
    }

    public SubFilterOptionStruct(int i, String str) {
        this.code = i;
        this.name = str;
    }
}
