package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ICt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46239ICt implements TII {
    public final TEZ LIZ;
    public final InterfaceC74343TFr LIZIZ;

    @Override // X.TII
    public final <T> TIH LIZ(InterfaceC46243ICx<T> request) {
        Bundle bundle;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        EffectCategoryModel effectCategoryModel;
        o.LJIIIZ(request, "request");
        if ((request instanceof TID) && (request.LIZIZ() == EnumC44267HYx.UI_CLICK || request.LIZIZ() == EnumC44267HYx.UI_GALLERY)) {
            TID tid = (TID) request;
            Effect effect = tid.LIZIZ;
            int i = tid.LJIIIIZZ;
            String str5 = "";
            if (i != Integer.MIN_VALUE) {
                TEZ tez = this.LIZ;
                o.LJIIIZ(tez, "<this>");
                TJV LIZ = tez.LJJJJLL().LIZ();
                if (i >= 0 && i < C30581Hy.LJIILJJIL(LIZ).size()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str6 = "1000001";
                if (z2) {
                    EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) ListProtector.get(C30581Hy.LJIILJJIL(LIZ), i);
                    String key = effectCategoryModel2.getKey();
                    if (o.LJ(key, "sticker_category:search")) {
                        str = "1000001";
                    } else if (o.LJ(key, "sticker_category:favorite")) {
                        str = "1000000";
                    } else {
                        str = effectCategoryModel2.getId();
                    }
                } else {
                    str = "-1";
                }
                TEZ tez2 = this.LIZ;
                o.LJIIIZ(tez2, "<this>");
                TJV LIZ2 = tez2.LJJJJLL().LIZ();
                if (i < 0 || i >= C30581Hy.LJIILJJIL(LIZ2).size() || (effectCategoryModel = (EffectCategoryModel) ListProtector.get(C30581Hy.LJIILJJIL(LIZ2), i)) == null || (str2 = effectCategoryModel.getName()) == null) {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(tid.LIZIZ.getSearchType())) {
                    str2 = tid.LIZIZ.getSearchType();
                } else {
                    str6 = str;
                }
                bundle = tid.LJFF;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                if (i >= 0) {
                    str5 = String.valueOf(i);
                }
                bundle.putString("prop_tab_order", str5);
                bundle.putString("prop_tab_name", str2);
                bundle.putString("tab_id", str6);
                String str7 = "1";
                if (request.LIZIZ() == EnumC44267HYx.MANUAL_SET) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                bundle.putString("is_auto_applied", str3);
                C43916HLk LJ = C1JD.LJ(this.LIZ, tid, i);
                if (LJ != null) {
                    str4 = LJ.LIZJ;
                } else {
                    str4 = null;
                }
                if (!C30581Hy.LJJIIJ(str4)) {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                bundle.putString("prop_selected_from_trending", str7);
                str5 = str2;
            } else {
                bundle = tid.LJFF;
            }
            InterfaceC74343TFr interfaceC74343TFr = this.LIZIZ;
            boolean LJJJJLL = C78866UxK.LJJJJLL(this.LIZ, effect);
            int position = request.getPosition();
            if (request.LIZIZ() == EnumC44267HYx.UI_GALLERY) {
                z = true;
            } else {
                z = false;
            }
            interfaceC74343TFr.LJIIIZ(effect, LJJJJLL, str5, position, z, bundle);
        }
        return new TIH(false, null);
    }

    public C46239ICt(TEZ stickerDataManager, InterfaceC74343TFr stickerMobHelper) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        this.LIZ = stickerDataManager;
        this.LIZIZ = stickerMobHelper;
    }
}
