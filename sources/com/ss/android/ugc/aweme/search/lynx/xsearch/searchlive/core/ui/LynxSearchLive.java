package com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui;

import X.ActivityC45651qj;
import X.C2U8;
import X.C45804HyK;
import X.C48929JIf;
import X.C48930JIg;
import X.C49183JRz;
import X.C49995Jjj;
import X.C50989Jzl;
import X.C55457Lpd;
import X.C78886Uxe;
import X.C78966Uyw;
import X.EWS;
import X.IL3;
import X.InterfaceC86353Xun;
import X.JSE;
import X.JT1;
import X.ORZ;
import X.VNU;
import X.VPD;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class LynxSearchLive extends LynxUI<C48929JIf> {
    public static final /* synthetic */ int LJLIL = 0;

    @EWS
    public final void play() {
        ((C48929JIf) this.mView).play();
    }

    @EWS
    public final void stop() {
        ((C48929JIf) this.mView).LJIILLIIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxSearchLive(VNU context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    public C48929JIf LJIJJLI(Context context) {
        o.LJIIIZ(context, "context");
        C48929JIf c48929JIf = new C48929JIf(context);
        c48929JIf.setEventChangeListener(new AqS190S0100000_8(this, 92));
        return c48929JIf;
    }

    @EWS
    public void getPlayerTag(Callback callback) {
        String str;
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        InterfaceC86353Xun interfaceC86353Xun = ((C48929JIf) this.mView).getDataProvider().LJIIIIZZ;
        if (interfaceC86353Xun == null || (str = interfaceC86353Xun.getPlayerTag()) == null) {
            str = "";
        }
        javaOnlyMap.putString("player_tag", str);
        callback.invoke(0, javaOnlyMap);
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((C48929JIf) this.mView).setAutoPlay(z);
    }

    @VPD(name = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (readableMap != null) {
            ((C48929JIf) this.mView).setAwemeIndex(new C48930JIg(readableMap.getInt("card_rank", -1), readableMap.getInt("aweme_index")));
        }
    }

    @VPD(name = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap == null || (hashMap = readableMap.toHashMap()) == null) {
            return;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            o.LJIIIIZZ(key, "it.key");
            hashMap2.put(key, entry.getValue());
        }
        ((C48929JIf) this.mView).setLogExtra(hashMap2);
    }

    @VPD(name = "muted")
    public void setMuted(int i) {
        ((C48929JIf) this.mView).setMuted(i);
    }

    @VPD(name = "objectfit")
    public final void setObjectFit(String objectFit) {
        o.LJIIIZ(objectFit, "objectFit");
        ((C48929JIf) this.mView).setObjectFit(objectFit);
    }

    @VPD(name = "sessionid")
    public final void setSessionId(int i) {
        ((C48929JIf) this.mView).setSessionId(i);
    }

    @EWS
    public final void setSharedInfoBeforeLaunchDetail(ReadableMap readableMap) {
        String str;
        ActivityC45651qj LJJIFFI;
        int i;
        long j;
        Aweme aweme;
        DynamicPatch dynamicPatch;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSharedInfo map: ");
        List<Aweme> list = null;
        if (readableMap != null) {
            str = readableMap.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (readableMap != null) {
            String aid = readableMap.getString("aid");
            String uid = readableMap.getString("uid");
            String keyword = readableMap.getString("keyword");
            if (!TextUtils.isEmpty(aid) && !TextUtils.isEmpty(uid) && !TextUtils.isEmpty(keyword)) {
                C48929JIf c48929JIf = (C48929JIf) this.mView;
                o.LJIIIIZZ(aid, "aid");
                o.LJIIIIZZ(uid, "uid");
                o.LJIIIIZZ(keyword, "keyword");
                c48929JIf.getClass();
                Context context = c48929JIf.getContext();
                int i2 = 0;
                if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || !o.LJ(C50989Jzl.LJ(), LJJIFFI) || TextUtils.isEmpty(aid)) {
                    return;
                }
                JSE LIZ2 = C49995Jjj.LIZ.LIZ(c48929JIf.LJLJI);
                if (LIZ2 != null && (dynamicPatch = LIZ2.LIZ) != null) {
                    list = dynamicPatch.getAwemeList();
                }
                if (C78886Uxe.LJJIJ(list)) {
                    return;
                }
                C78966Uyw.LJLJJL = list;
                C49183JRz c49183JRz = new C49183JRz();
                c49183JRz.LIZ = keyword;
                c49183JRz.LIZIZ = 4;
                c49183JRz.LIZJ = uid;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                c49183JRz.LIZLLL = i;
                if (list != null && (aweme = (Aweme) ORZ.LLFII(list)) != null) {
                    j = aweme.getCreateTime();
                } else {
                    j = 0;
                }
                c49183JRz.LJFF = j;
                ContinuousLoadingAwemeList continuousLoadingAwemeList = new ContinuousLoadingAwemeList();
                continuousLoadingAwemeList.awemeList = list;
                if (list != null) {
                    i2 = list.size();
                }
                continuousLoadingAwemeList.cursor = i2;
                continuousLoadingAwemeList.hasMore = 1;
                JT1 jt1 = new JT1();
                jt1.LJIILJJIL(continuousLoadingAwemeList);
                jt1.LJIIL().LIZ(c49183JRz);
                C55457Lpd.LJLJJLL = jt1;
                C2U8.LIZ(new IL3(aid));
            }
        }
    }

    @VPD(name = "soundControl")
    public void setSoundControl(int i) {
        ((C48929JIf) this.mView).setSoundControl(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* bridge */ /* synthetic */ C48929JIf createView(Context context, Object obj) {
        return LJIJJLI(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
