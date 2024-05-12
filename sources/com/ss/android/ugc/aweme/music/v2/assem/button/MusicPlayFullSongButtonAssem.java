package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.AbstractC73672Svk;
import X.C110614Vt;
import X.C214298b3;
import X.C221108m2;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC64592gB;
import X.MG0;
import X.SUF;
import X.SUG;
import X.SUH;
import X.SY4;
import X.T16;
import X.TBT;
import Y.IDhS12S1100000_9;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class MusicPlayFullSongButtonAssem extends DynamicAssem {
    public static final /* synthetic */ int LJLLL = 0;
    public SUF LJLJLLL;
    public SUG LJLL;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 790));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 791));
    public final C214298b3 LJLLJ;

    public MusicPlayFullSongButtonAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLJ = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 792), SUH.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bvb;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        SUF suf = this.LJLJLLL;
        if (suf != null) {
            ActivityStack.removeAppBackGroundListener(suf);
        }
        SUG sug = this.LJLL;
        if (sug != null) {
            MG0.LIZLLL.remove(sug);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        SY4 sy4 = (SY4) view;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(6);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        Context context = sy4.getContext();
        o.LJIIIIZZ(context, "view.context");
        sy4.setBackground(c110614Vt.LIZ(context));
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLJ.getValue(), new TBT() { // from class: X.OGb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS116S0300000_12(this, view, sy4, 15), 14, null);
    }

    public final void L3(ExternalMusicInfo musicInfo, final Map<String, String> params) {
        this.LJLLJ.getValue();
        PowerPreloadServiceImpl.LIZIZ().LIZ("tiktok/music/dsp/ttm/vip_info/v2/", null);
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLLJ.getValue();
        o.LJIIIZ(musicInfo, "musicInfo");
        o.LJIIIZ(params, "params");
        String vipSchema = musicInfo.getVipVerificationSchema();
        if (vipSchema == null || vipSchema.length() == 0) {
            return;
        }
        String partnerSongId = musicInfo.getPartnerSongId();
        o.LJIIIZ(vipSchema, "vipSchema");
        final Uri parse = UriProtector.parse(vipSchema);
        assemViewModel.disposeOnClear(AbstractC73672Svk.LJJIIJZLJL(new Callable() { // from class: X.2iV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
                o.LJIIIIZZ(queryParameterNames, "uri.queryParameterNames");
                android.net.Uri uri = parse;
                for (String key : queryParameterNames) {
                    o.LJIIIIZZ(key, "key");
                    linkedHashMap.put(key, UriProtector.getQueryParameter(uri, key));
                }
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    String key2 = entry.getKey();
                    String value = entry.getValue();
                    if (!linkedHashMap.containsKey(key2)) {
                        linkedHashMap.put(key2, value);
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (String str : ORZ.LLIL(linkedHashMap.keySet())) {
                    try {
                        jSONObject.put(str, linkedHashMap.get(str));
                    } catch (Exception unused) {
                    }
                }
                return jSONObject.toString();
            }
        }).LJJIJL(new IDhS12S1100000_9(parse, partnerSongId, 1)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9FB
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9FC
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
    }
}
