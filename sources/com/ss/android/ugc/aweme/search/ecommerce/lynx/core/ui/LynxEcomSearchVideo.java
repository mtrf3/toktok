package com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui;

import X.C79045V0n;
import X.EWS;
import X.JGI;
import X.JHN;
import X.JI6;
import X.JS2;
import X.VNU;
import X.VPD;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LynxEcomSearchVideo extends LynxSearchVideo {
    public volatile int LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @VPD(name = "soundControl")
    public void setSoundControl(int i) {
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @EWS
    public void play() {
        boolean z;
        JHN jhn = (JHN) this.mView;
        if (JI6.LIZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        jhn.setAutoPlay(z);
        JGI core = ((JHN) this.mView).getCore();
        if (core != null) {
            core.setEnableProgressCallback(true);
        }
        super.play();
    }

    public LynxEcomSearchVideo(VNU vnu) {
        super(vnu);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    /* renamed from: LJIJJLI */
    public final JHN createView(Context context) {
        o.LJI(context);
        JHN jhn = new JHN(context);
        jhn.setEventChangeListener(new AqS190S0100000_8(this, 17));
        jhn.setPlayStatusActionHandler(new AqS174S0100000_8(this, 73));
        return jhn;
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ JHN createView(Context context) {
        return createView(context);
    }

    @VPD(name = "aweme")
    public final void setAweme(String str) {
        int i;
        if (str != null) {
            Aweme _aweme = (Aweme) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, new JS2().getType());
            ((JHN) this.mView).setIsECommerce(true);
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
            JHN jhn2 = (JHN) this.mView;
            o.LJIIIIZZ(_aweme, "_aweme");
            jhn2.LIZIZ(_aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo
    @VPD(name = "muted")
    public void setMuted(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LJLILLLLZI = i;
    }

    @VPD(name = "poster")
    public final void setPoster(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        ((JHN) this.mView).setPoster(str);
    }

    @EWS
    public final void setShareEcomVideoPlayer(ReadableMap readableMap) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setShareVideoPlayer map: ");
        if (readableMap != null) {
            str = readableMap.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (readableMap != null) {
            String aid = readableMap.getString("aid");
            if (!TextUtils.isEmpty(aid)) {
                JHN jhn = (JHN) this.mView;
                o.LJIIIIZZ(aid, "aid");
                jhn.setShareEComVideoPlayerBeforeLaunchDetail(aid);
            }
        }
    }
}
