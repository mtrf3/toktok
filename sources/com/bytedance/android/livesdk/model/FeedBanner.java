package com.bytedance.android.livesdk.model;

import X.BLG;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public class FeedBanner implements BLG {
    public ImageModel LJLIL;

    @InterfaceC65349Pkn("avg_color")
    public String avgColor;

    @InterfaceC65349Pkn("banner_type")
    public int bannerType;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @InterfaceC65349Pkn("width")
    public int width;

    public final ImageModel LIZIZ() {
        if (this.LJLIL == null && this.urlList != null && this.uri != null) {
            this.LJLIL = new ImageModel(this.uri, this.urlList);
        }
        return this.LJLIL;
    }

    @Override // X.BLG
    public final ImageModel cover() {
        return LIZIZ();
    }

    @Override // X.BLG
    public final long getId() {
        return this.id;
    }

    public final boolean LIZ(FeedBanner feedBanner) {
        if (this == feedBanner) {
            return true;
        }
        if (feedBanner == null || this.id != feedBanner.id || !TextUtils.equals(this.title, feedBanner.title) || !TextUtils.equals(this.uri, feedBanner.uri) || !TextUtils.equals(this.schemaUrl, feedBanner.schemaUrl) || !TextUtils.equals(this.text, feedBanner.text) || this.width != feedBanner.width || this.height != feedBanner.height) {
            return false;
        }
        List<String> list = this.urlList;
        if (list == null) {
            if (feedBanner.urlList != null) {
                return false;
            }
            if (feedBanner.urlList == null) {
                return true;
            }
        } else if (feedBanner.urlList == null) {
            return false;
        }
        if (list.size() != feedBanner.urlList.size()) {
            return false;
        }
        for (int i = 0; i < this.urlList.size(); i++) {
            if (!TextUtils.equals((CharSequence) ListProtector.get(this.urlList, i), (CharSequence) ListProtector.get(feedBanner.urlList, i))) {
                return false;
            }
        }
        return true;
    }
}
