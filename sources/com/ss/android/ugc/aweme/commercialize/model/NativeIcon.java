package com.ss.android.ugc.aweme.commercialize.model;

import X.C59256NNk;
import X.C59257NNl;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes11.dex */
public class NativeIcon implements Serializable {

    @InterfaceC65349Pkn("icon_click")
    public IconClick iconClick;

    @InterfaceC65349Pkn("static_resource")
    public Set<String> staticResource;

    @InterfaceC65349Pkn("icon_view_tracking")
    public Set<String> viewTracking;

    /* loaded from: classes11.dex */
    public static class IconClick implements Serializable {

        @InterfaceC65349Pkn("click_through")
        public String clickThrough;

        @InterfaceC65349Pkn("click_tracking")
        public Set<String> clickTracking;

        public C59257NNl toVideoClick() {
            C59257NNl c59257NNl = new C59257NNl();
            c59257NNl.clickThrough = this.clickThrough;
            c59257NNl.clickTracking = this.clickTracking;
            return c59257NNl;
        }

        public String getClickThrough() {
            return this.clickThrough;
        }

        public Set<String> getClickTracking() {
            return this.clickTracking;
        }

        public void setClickThrough(String str) {
            this.clickThrough = str;
        }

        public void setClickTracking(Set<String> set) {
            this.clickTracking = set;
        }
    }

    public IconClick getIconClick() {
        return this.iconClick;
    }

    public Set<String> getStaticResource() {
        return this.staticResource;
    }

    public Set<String> getViewTracking() {
        return this.viewTracking;
    }

    public void setIconClick(IconClick iconClick) {
        this.iconClick = iconClick;
    }

    public void setStaticResource(Set<String> set) {
        this.staticResource = set;
    }

    public void setViewTracking(Set<String> set) {
        this.viewTracking = set;
    }

    public C59256NNk toIcon(String str) {
        C59256NNk c59256NNk = new C59256NNk();
        c59256NNk.program = str;
        c59256NNk.staticResource = this.staticResource;
        c59256NNk.viewTracking = this.viewTracking;
        if (this.iconClick != null) {
            LinkedList linkedList = new LinkedList();
            c59256NNk.clickList = linkedList;
            linkedList.add(this.iconClick.toVideoClick());
        }
        return c59256NNk;
    }
}
