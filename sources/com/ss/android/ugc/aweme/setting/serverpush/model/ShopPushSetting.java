package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ShopPushSetting extends F9E implements Serializable {

    @InterfaceC65349Pkn("shop_alerts_reminders_push")
    public final int shopAlertsRemindersPush;

    @InterfaceC65349Pkn("shop_tiktok_support_push")
    public final int shopCustomerSupportPush;

    @InterfaceC65349Pkn("shop_order_update_push")
    public final int shopOrderUpdatesPush;

    @InterfaceC65349Pkn("shop_promotions_push")
    public final int shopPromotionsPush;

    @InterfaceC65349Pkn("shop_sellers_chats_push")
    public final int shopSellersChatsPush;

    @InterfaceC65349Pkn("shop_surveys_push")
    public final int shopSurveysPush;

    public static /* synthetic */ ShopPushSetting copy$default(ShopPushSetting shopPushSetting, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = shopPushSetting.shopOrderUpdatesPush;
        }
        if ((i7 & 2) != 0) {
            i2 = shopPushSetting.shopAlertsRemindersPush;
        }
        if ((i7 & 4) != 0) {
            i3 = shopPushSetting.shopSurveysPush;
        }
        if ((i7 & 8) != 0) {
            i4 = shopPushSetting.shopPromotionsPush;
        }
        if ((i7 & 16) != 0) {
            i5 = shopPushSetting.shopSellersChatsPush;
        }
        if ((i7 & 32) != 0) {
            i6 = shopPushSetting.shopCustomerSupportPush;
        }
        return shopPushSetting.copy(i, i2, i3, i4, i5, i6);
    }

    public final ShopPushSetting copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ShopPushSetting(i, i2, i3, i4, i5, i6);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.shopOrderUpdatesPush), Integer.valueOf(this.shopAlertsRemindersPush), Integer.valueOf(this.shopSurveysPush), Integer.valueOf(this.shopPromotionsPush), Integer.valueOf(this.shopSellersChatsPush), Integer.valueOf(this.shopCustomerSupportPush)};
    }

    public final int getShopAlertsRemindersPush() {
        return this.shopAlertsRemindersPush;
    }

    public final int getShopCustomerSupportPush() {
        return this.shopCustomerSupportPush;
    }

    public final int getShopOrderUpdatesPush() {
        return this.shopOrderUpdatesPush;
    }

    public final int getShopPromotionsPush() {
        return this.shopPromotionsPush;
    }

    public final int getShopSellersChatsPush() {
        return this.shopSellersChatsPush;
    }

    public final int getShopSurveysPush() {
        return this.shopSurveysPush;
    }

    public ShopPushSetting(int i, int i2, int i3, int i4, int i5, int i6) {
        this.shopOrderUpdatesPush = i;
        this.shopAlertsRemindersPush = i2;
        this.shopSurveysPush = i3;
        this.shopPromotionsPush = i4;
        this.shopSellersChatsPush = i5;
        this.shopCustomerSupportPush = i6;
    }
}
