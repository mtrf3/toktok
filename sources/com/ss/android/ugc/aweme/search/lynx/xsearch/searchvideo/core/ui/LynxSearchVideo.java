package com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui;

import X.C221108m2;
import X.C2U8;
import X.C48880JGi;
import X.C48881JGj;
import X.C48892JGu;
import X.C48898JHa;
import X.C48920JHw;
import X.C49183JRz;
import X.C49995Jjj;
import X.C55457Lpd;
import X.C62822Ol8;
import X.C78886Uxe;
import X.C78966Uyw;
import X.C79045V0n;
import X.EWS;
import X.EnumC48901JHd;
import X.IL3;
import X.JHN;
import X.JHR;
import X.JSE;
import X.JT1;
import X.KMP;
import X.ORZ;
import X.VNU;
import X.VPD;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes9.dex */
public class LynxSearchVideo extends LynxUI<JHN> {
    public static final C62822Ol8 LJLIL = C221108m2.LIZIZ(C48920JHw.LJLIL);

    @EWS
    public final void pause() {
        ((JHN) this.mView).pause();
    }

    @EWS
    public void play() {
        ((JHN) this.mView).play();
    }

    @EWS
    public final void stop() {
        String str;
        JHN jhn = (JHN) this.mView;
        jhn.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop:");
        Aweme mAweme = jhn.getMAweme();
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        jhn.LJIIIZ();
        C48898JHa.LIZ.LIZ(null, null, jhn.LJLJL, EnumC48901JHd.STOP_OTHER);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        super.measure();
    }

    public LynxSearchVideo(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public JHN createView(Context context) {
        o.LJI(context);
        JHN jhn = new JHN(context);
        jhn.setEventChangeListener(new AqS190S0100000_8(this, 18));
        return jhn;
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        ((JHN) this.mView).setAutoPlay(z);
    }

    @VPD(name = "aweme")
    public final void setAweme(ReadableMap readableMap) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme: ");
        if (readableMap != null) {
            str = readableMap.getString("aid");
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (readableMap != null) {
            JHN jhn = (JHN) this.mView;
            String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), readableMap);
            o.LJIIIIZZ(json, "get().gson.toJson(aweme)");
            jhn.setAweme(json);
        }
    }

    @VPD(name = "awemedata")
    public final void setAwemeData(ReadableMap readableMap) {
        if (readableMap != null) {
            JHN jhn = (JHN) this.mView;
            String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), readableMap);
            o.LJIIIIZZ(json, "get().gson.toJson(it)");
            jhn.setAwemeData(json);
        }
    }

    @VPD(name = "awemeindex")
    public final void setAwemeIndex(ReadableMap readableMap) {
        if (readableMap != null && readableMap.hasKey("card_rank") && readableMap.hasKey("aweme_index")) {
            ((JHN) this.mView).setAwemeIndex(new JHR((int) readableMap.getDouble("card_rank"), (int) readableMap.getDouble("aweme_index")));
        }
    }

    @VPD(name = "__control")
    public final void setControl(String str) {
        boolean z;
        JHN jhn;
        JSONObject jSONObject;
        JHN jhn2;
        if (str != null) {
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && s.LJLJJL(str, new String[]{"_*_"}, 0, 6).size() == 3) {
                List LJLJJL = s.LJLJJL(str, new String[]{"_*_"}, 0, 6);
                String str2 = (String) ListProtector.get(LJLJJL, 0);
                int hashCode = str2.hashCode();
                if (hashCode != 3443508) {
                    if (hashCode != 3526264) {
                        if (hashCode != 106440182 || !str2.equals("pause") || (jhn2 = (JHN) this.mView) == null) {
                            return;
                        }
                        jhn2.pause();
                        return;
                    }
                    if (!str2.equals("seek")) {
                        return;
                    }
                    try {
                        jSONObject = new JSONObject((String) ListProtector.get(LJLJJL, 1));
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                    JHN jhn3 = (JHN) this.mView;
                    if (jhn3 == null) {
                        return;
                    }
                    int optInt = jSONObject.optInt("position", 0);
                    if (jSONObject.optInt("play") != 1) {
                        z2 = false;
                    }
                    jhn3.LJIIIIZZ(optInt, z2);
                    return;
                }
                if (!str2.equals("play") || (jhn = (JHN) this.mView) == null) {
                    return;
                }
                jhn.play();
            }
        }
    }

    @VPD(name = "logextra")
    public final void setLogExtra(ReadableMap readableMap) {
        if (readableMap != null) {
            JHN jhn = (JHN) this.mView;
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            o.LJIIIIZZ(hashMap, "it.toHashMap()");
            jhn.setLogExtra(hashMap);
        }
    }

    @VPD(name = "muted")
    public void setMuted(int i) {
        ((JHN) this.mView).setMuted(i);
    }

    @VPD(name = "objectfit")
    public final void setObjectFit(String objectFit) {
        o.LJIIIZ(objectFit, "objectFit");
        ((JHN) this.mView).setObjectFit(objectFit);
    }

    @VPD(name = "opaqueplaceholder")
    public final void setOpaquePlaceHolder(boolean z) {
        int i;
        if (z) {
            JHN jhn = (JHN) this.mView;
            Context LIZ = this.mContext.LIZ();
            o.LJIIIIZZ(LIZ, "mContext.context");
            Integer LJI = C79045V0n.LJI(R.attr.ck, LIZ);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            jhn.setCoverPlaceholder(i);
        }
    }

    @VPD(name = "rate")
    public final void setRate(int i) {
        System.out.println((Object) KMP.LJ("XSearchVideo- rate -> ", i));
        ((JHN) this.mView).setRate(i);
    }

    @VPD(name = "repeat")
    public final void setRepeat(boolean z) {
        ((JHN) this.mView).setRepeat(z);
    }

    @VPD(name = "sessionid")
    public final void setSessionId(int i) {
        ((JHN) this.mView).setSessionId(i);
    }

    @EWS
    public final void setSharedInfoBeforeLaunchDetail(ReadableMap readableMap) {
        String str;
        int i;
        long j;
        C48880JGi LJI;
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
                JHN jhn = (JHN) this.mView;
                o.LJIIIIZZ(aid, "aid");
                o.LJIIIIZZ(uid, "uid");
                o.LJIIIIZZ(keyword, "keyword");
                jhn.getClass();
                if (JHN.LJ(jhn.getContext()) || TextUtils.isEmpty(aid)) {
                    return;
                }
                JSE LIZ2 = C49995Jjj.LIZ.LIZ(jhn.LJLJJLL);
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
                int i2 = 0;
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
                C48881JGj c48881JGj = jhn.LJLIL;
                if (c48881JGj == null || (LJI = c48881JGj.LJI()) == null) {
                    return;
                }
                C48892JGu.LIZ(c48881JGj, true);
                String str2 = LJI.LJIIIIZZ;
                o.LJIIIIZZ(str2, "shareInfo.shareId");
                C2U8.LIZ(new IL3(str2));
            }
        }
    }

    @VPD(name = "soundControl")
    public void setSoundControl(int i) {
        ((JHN) this.mView).setSoundControl(i);
    }

    @EWS
    public final void seek(int i, boolean z) {
        ((JHN) this.mView).LJIIIIZZ(i, z);
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
