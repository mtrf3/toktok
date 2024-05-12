package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class ShareStruct extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("bool_persist")
    public int boolPersist;

    @InterfaceC65349Pkn("share_desc")
    public String shareDesc;

    @InterfaceC65349Pkn("share_link_desc")
    public String shareLinkDesc;

    @InterfaceC65349Pkn("share_qrcode_url")
    public UrlModel shareQrcodeUrl;

    @InterfaceC65349Pkn("share_title")
    public String shareTitle;

    @InterfaceC65349Pkn("share_url")
    public String shareUrl;

    @InterfaceC65349Pkn("share_weibo_desc")
    public String shareWeiboDesc;
}
