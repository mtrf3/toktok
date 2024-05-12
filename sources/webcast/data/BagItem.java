package webcast.data;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;

/* loaded from: classes6.dex */
public final class BagItem {

    @InterfaceC65349Pkn("available")
    public boolean available;

    @InterfaceC65349Pkn("banner")
    public GiftPanelBanner banner;

    @InterfaceC65349Pkn("count")
    public long count;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("item_id")
    public long itemId;

    @InterfaceC65349Pkn("item_type")
    public int itemType;

    @InterfaceC65349Pkn("min_expire_at")
    public long minExpireAt;

    @InterfaceC65349Pkn("pre_update_info")
    public BagItemPreUpdateInfo preUpdateInfo;

    @InterfaceC65349Pkn("preview_image")
    public ImageModel previewImage;

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("toast")
    public String toast = "";
}
