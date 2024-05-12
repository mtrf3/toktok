package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReferralFeedBanner extends C95U {

    @InterfaceC65349Pkn("age_gate_popup_view")
    public AgeGatePopup ageGate;

    @InterfaceC65349Pkn("attribute_info")
    public final AttributeInfo attributeInfo;

    @InterfaceC65349Pkn("banner_type")
    public int bannerType;

    @InterfaceC65349Pkn("card_piles")
    public final List<Pile> cardPile;

    @InterfaceC65349Pkn("carousels")
    public final List<Carousels> carousels;

    @InterfaceC65349Pkn("compact_pictures")
    public final List<CompactPicture> compactPictures;

    @InterfaceC65349Pkn("event_params")
    public Map<String, String> eventParams;

    @InterfaceC65349Pkn("hint")
    public String hint;

    @InterfaceC65349Pkn("need_age_gate")
    public boolean needAgeGate;

    @InterfaceC65349Pkn("notification_id")
    public final String notificationId;

    @InterfaceC65349Pkn("notification_name")
    public final String notificationName;

    @InterfaceC65349Pkn("pictures")
    public final List<Picture> pictures;

    @InterfaceC65349Pkn("piles")
    public final List<Pile> pile;

    @InterfaceC65349Pkn("popup_callback")
    public String popupCallback;

    @InterfaceC65349Pkn("videos")
    public final List<Video> videos;

    public final Object[] LIZIZ() {
        return new Object[]{Integer.valueOf(this.bannerType), this.eventParams, this.videos, this.pictures, this.carousels, this.compactPictures, this.pile, this.cardPile, Boolean.valueOf(this.needAgeGate), this.ageGate, this.popupCallback, this.hint, this.notificationId, this.notificationName, this.attributeInfo};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReferralFeedBanner) {
            return C78966Uyw.LJIIIZ(((ReferralFeedBanner) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ReferralFeedBanner:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public ReferralFeedBanner(int i, Map<String, String> map, List<Video> list, List<Picture> list2, List<Carousels> list3, List<CompactPicture> list4, List<Pile> list5, List<Pile> list6, boolean z, AgeGatePopup ageGate, String popupCallback, String hint, String notificationId, String str, AttributeInfo attributeInfo) {
        o.LJIIIZ(ageGate, "ageGate");
        o.LJIIIZ(popupCallback, "popupCallback");
        o.LJIIIZ(hint, "hint");
        o.LJIIIZ(notificationId, "notificationId");
        this.bannerType = i;
        this.eventParams = map;
        this.videos = list;
        this.pictures = list2;
        this.carousels = list3;
        this.compactPictures = list4;
        this.pile = list5;
        this.cardPile = list6;
        this.needAgeGate = z;
        this.ageGate = ageGate;
        this.popupCallback = popupCallback;
        this.hint = hint;
        this.notificationId = notificationId;
        this.notificationName = str;
        this.attributeInfo = attributeInfo;
    }
}
