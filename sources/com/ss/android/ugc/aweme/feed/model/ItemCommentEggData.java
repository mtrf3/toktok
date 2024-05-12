package com.ss.android.ugc.aweme.feed.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class ItemCommentEggData implements Serializable {

    @InterfaceC65349Pkn("egg_id")
    public String eggId;

    @InterfaceC65349Pkn("file_type")
    public String fileType;

    @InterfaceC65349Pkn("material_url")
    public String materialUrl;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("regex")
    public String regex;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemCommentEggData{regex='");
        Q89.LIZIZ(LIZ, this.regex, '\'', ", fileType='");
        Q89.LIZIZ(LIZ, this.fileType, '\'', ", webUrl='");
        Q89.LIZIZ(LIZ, this.webUrl, '\'', ", openUrl='");
        Q89.LIZIZ(LIZ, this.openUrl, '\'', ", materialUrl='");
        Q89.LIZIZ(LIZ, this.materialUrl, '\'', ", eggId='");
        return C77800Ug8.LIZJ(LIZ, this.eggId, '\'', '}', LIZ);
    }

    public String getEggId() {
        return this.eggId;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getRegex() {
        return this.regex;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setEggId(String str) {
        this.eggId = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setRegex(String str) {
        this.regex = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
