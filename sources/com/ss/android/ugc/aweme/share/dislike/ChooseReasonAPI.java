package com.ss.android.ugc.aweme.share.dislike;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import X.C73969T1h;
import X.C76800UCe;
import X.C9TH;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64592gB;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC64992Pf2;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.T16;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ChooseReasonAPI {
    public static InterfaceC88471Ynr<? super List<Keyword>, ? super Integer, C76800UCe> LIZJ;
    public static InterfaceC65784Pro<C76800UCe> LIZLLL;
    public static InterfaceC88472Yns<? super Throwable, C76800UCe> LJ;
    public static InterfaceC65784Pro<C76800UCe> LJFF;
    public static InterfaceC88472Yns<? super Throwable, C76800UCe> LJI;
    public static FilteredKeywords LJII;
    public static Map<String, String> LIZ = new LinkedHashMap();
    public static final Gson LIZIZ = new Gson();
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C9TH.LJLIL);

    /* loaded from: classes5.dex */
    public interface RealAPI {
        @InterfaceC195787mI
        @E4T("/tiktok/v1/mute/create/")
        AbstractC73672Svk<BaseResponse> createKeywords(@InterfaceC64987Pex("texts") String str, @InterfaceC64987Pex("scenes") String str2);

        @InterfaceC195787mI
        @E4T("/aweme/v1/commit/dislike/item/")
        AbstractC73672Svk<BaseResponse> dislikeAweme(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64992Pf2 Map<String, String> map, @InterfaceC64987Pex("dislike_hashtags") String str2, @InterfaceC64987Pex("dislike_reason_ids") String str3);

        @E4Q("/tiktok/v1/mute/query/")
        AbstractC73672Svk<FilteredKeywords> getFilteredKeywords();
    }

    public static void LIZ(List list) {
        List LJJIJ = C47261Igj.LJJIJ(0);
        if (((ArrayList) list).isEmpty()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = LJFF;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        RealAPI realAPI = (RealAPI) LJIIIIZZ.getValue();
        Gson gson = LIZIZ;
        String json = GsonProtectorUtils.toJson(gson, list);
        o.LJIIIIZZ(json, "gson.toJson(words)");
        String json2 = GsonProtectorUtils.toJson(gson, LJJIJ);
        o.LJIIIIZZ(json2, "gson.toJson(scenes)");
        realAPI.createKeywords(json, json2).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9TK
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = ChooseReasonAPI.LJFF;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
            }
        }, new InterfaceC64592gB() { // from class: X.9TL
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns = ChooseReasonAPI.LJI;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(obj);
                }
            }
        });
    }

    public static void LIZIZ(String str, List dislikeHashtags, List list) {
        o.LJIIIZ(dislikeHashtags, "dislikeHashtags");
        if (!dislikeHashtags.isEmpty()) {
            ((ArrayList) list).add(6);
        }
        RealAPI realAPI = (RealAPI) LJIIIIZZ.getValue();
        Map<String, String> map = LIZ;
        Gson gson = LIZIZ;
        String json = GsonProtectorUtils.toJson(gson, dislikeHashtags);
        o.LJIIIIZZ(json, "gson.toJson(dislikeHashtags)");
        String json2 = GsonProtectorUtils.toJson(gson, list);
        o.LJIIIIZZ(json2, "gson.toJson(dislikeReasonIds)");
        realAPI.dislikeAweme(str, map, json, json2).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9TI
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ChooseReasonAPI.LIZLLL;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        }, new InterfaceC64592gB() { // from class: X.9TJ
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns = ChooseReasonAPI.LJ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(obj);
                }
            }
        });
    }
}
