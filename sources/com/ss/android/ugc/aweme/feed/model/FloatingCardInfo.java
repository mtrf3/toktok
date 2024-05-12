package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public class FloatingCardInfo implements Serializable {
    public static final long serialVersionUID = 42;

    @InterfaceC65349Pkn("button_bg")
    public UrlModel buttonBackground;

    @InterfaceC65349Pkn("button_desc")
    public String buttonDesc;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("icons")
    public List<UrlModel> icons;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("schema_desc")
    public String schemaDesc;

    @InterfaceC65349Pkn("title")
    public String title;

    public UrlModel getButtonBackground() {
        return this.buttonBackground;
    }

    public String getButtonDesc() {
        return this.buttonDesc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getIcons() {
        return this.icons;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSchemaDesc() {
        return this.schemaDesc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtonBackground(UrlModel urlModel) {
        this.buttonBackground = urlModel;
    }

    public void setButtonDesc(String str) {
        this.buttonDesc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcons(List<UrlModel> list) {
        this.icons = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaDesc(String str) {
        this.schemaDesc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
