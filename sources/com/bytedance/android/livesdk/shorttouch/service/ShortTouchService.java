package com.bytedance.android.livesdk.shorttouch.service;

import X.AbstractC77108UOa;
import X.BZI;
import X.C0NB;
import X.C15380j0;
import X.C18950ol;
import X.C28787BRn;
import X.C29044Baa;
import X.C31220CNc;
import X.C31811Ce7;
import X.C77111UOd;
import X.CCJ;
import X.EnumC30639C0t;
import X.InterfaceC30642C0w;
import X.JBR;
import X.UOJ;
import X.UOK;
import X.UOL;
import X.UOM;
import X.UOS;
import X.UOT;
import X.UOW;
import X.UOX;
import X.UOY;
import X.X1D;
import Y.ACListenerS23S0100100_5;
import Y.ALAdapterS10S0100000_13;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.shorttouch.ui.LandscapeShortTouchPreviewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.LandscapeShortTouchViewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchViewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ShortTouchService implements IShortTouchService {
    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> Sm0() {
        return PortraitShortTouchPreviewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> UA() {
        return PortraitShortTouchViewWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> tB() {
        return LandscapeShortTouchPreviewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> yS() {
        return LandscapeShortTouchViewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void mu0() {
        String str;
        String str2;
        Boolean bool;
        UOJ uoj = C77111UOd.LIZ;
        List<UOW> list = uoj.LIZJ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() >= 1) {
                HashMap hashMap = new HashMap(11);
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null) {
                    String idStr = room.getIdStr();
                    if (idStr == null) {
                        idStr = String.valueOf(room.getId());
                    }
                    hashMap.put("room_id", idStr);
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                }
                DataChannel dataChannel = uoj.LJI;
                if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null && bool.booleanValue()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_anchor", str);
                HashMap hashMap2 = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UOX LIZIZ = uoj.LIZIZ(UOS.ID, ((UOW) it.next()).LJLILLLLZI);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("queue release: ");
                    if (LIZIZ != null) {
                        str2 = LIZIZ.LIZLLL;
                    } else {
                        str2 = null;
                    }
                    C31811Ce7.LJ(LIZ, str2, LIZ, "tianweirui1");
                    if (LIZIZ != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        String LJFF = JBR.LJFF(LIZ2, LIZIZ.LIZLLL, "_node_count", LIZ2);
                        Long l = (Long) hashMap2.get(LJFF);
                        if (l == null) {
                            l = 0L;
                        }
                        o.LJIIIIZZ(l, "map[shortTouchKey] ?: 0");
                        hashMap2.put(LJFF, Long.valueOf(l.longValue() + 1));
                    }
                }
                BZI LIZ3 = C28787BRn.LIZ("livesdk_short_touch_queue_release");
                LIZ3.LJJIFFI(hashMap);
                LIZ3.LJJII(hashMap2);
                LIZ3.LJIIZILJ();
                LIZ3.LJJIIJZLJL();
            }
        }
        List<UOX> list2 = uoj.LIZIZ;
        if (list2 != null) {
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                UOX uox = (UOX) it2.next();
                uox.LIZ.LLLLZLL();
                UOY uoy = uox.LIZIZ;
                if (uoy != null) {
                    uoy.LLLLZLL();
                }
            }
        }
        uoj.LJI = null;
        uoj.LJII.removeCallbacksAndMessages(null);
        uoj.LIZIZ = null;
        uoj.LIZJ = null;
        uoj.LIZ = false;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final String PE() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SHORT_TOUCH_NATIVE");
        int i = UOJ.LJIIIIZZ;
        UOJ.LJIIIIZZ = i + 1;
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Animator Es0(View view) {
        int LIZ;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        if (CCJ.LIZ(view.getContext())) {
            LIZ = C15380j0.LIZ(82.0f);
        } else {
            LIZ = C15380j0.LIZ(-82.0f);
        }
        fArr[0] = LIZ;
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        ofFloat.setDuration(480L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.41f, 1.44f, 0.42f, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        ofFloat2.setDuration(660L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
        ofFloat3.setDuration(460L);
        ofFloat3.setInterpolator(C18950ol.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f);
        ofFloat4.setDuration(460L);
        ofFloat4.setInterpolator(C18950ol.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.play(ofFloat2).before(ofFloat3);
        animatorSet.play(ofFloat3).with(ofFloat4);
        animatorSet.addListener(new ALAdapterS10S0100000_13(view, 16));
        return animatorSet;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void Ug0(DataChannel dataChannel) {
        UOJ uoj = C77111UOd.LIZ;
        uoj.getClass();
        uoj.LIZIZ = new ArrayList();
        uoj.LIZJ = new ArrayList();
        uoj.LIZ = false;
        uoj.LJI = dataChannel;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void B10(InterfaceC30642C0w view, UOY uoy) {
        o.LJIIIZ(view, "view");
        UOJ uoj = C77111UOd.LIZ;
        uoj.getClass();
        uoj.LIZ(new UOX(view, uoy));
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void sX(UOS identify, String value) {
        o.LJIIIZ(identify, "identify");
        o.LJIIIZ(value, "value");
        C77111UOd.LIZ.LJ(identify, value);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final InterfaceC30642C0w vr(UOS identify, String value) {
        o.LJIIIZ(identify, "identify");
        o.LJIIIZ(value, "value");
        UOJ uoj = C77111UOd.LIZ;
        uoj.getClass();
        UOX LIZIZ = uoj.LIZIZ(identify, value);
        if (LIZIZ != null) {
            return LIZIZ.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final C31220CNc FX(Context context, Uri uri, String name, boolean z) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(name, "name");
        return new C31220CNc(context, uri, name, z);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final AbstractC77108UOa a40(Context context, long j, UOT uot, ACListenerS23S0100100_5 aCListenerS23S0100100_5) {
        if (uot.LJLJJI == EnumC30639C0t.IMAGE) {
            return new UOK(context, j, uot, aCListenerS23S0100100_5);
        }
        return new UOL(context, j, uot, aCListenerS23S0100100_5);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void n50(UOS identify, String value, InterfaceC30642C0w interfaceC30642C0w, UOY uoy) {
        o.LJIIIZ(identify, "identify");
        o.LJIIIZ(value, "value");
        UOJ uoj = C77111UOd.LIZ;
        uoj.getClass();
        UOX uox = new UOX(interfaceC30642C0w, uoy);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Short touch presenter] Refresh item, identify = ");
        LIZ.append(identify);
        LIZ.append(", value = ");
        LIZ.append(value);
        LIZ.append(", id = ");
        LIZ.append(uox.LIZJ);
        LIZ.append(", name = ");
        LIZ.append(uox.LIZLLL);
        C0NB.LIZIZ("TikTok Live Short Touch", X1D.LIZIZ(LIZ));
        uoj.LJ(identify, value);
        uoj.LIZ(uox);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final String HK(Context context, Uri view, String str, boolean z, Uri uri, Boolean bool) {
        UOM uom;
        o.LJIIIZ(view, "view");
        C31220CNc FX = FX(context, view, str, z);
        if (uri != null && bool != null) {
            uom = new UOM(context, uri, this, bool.booleanValue());
        } else {
            uom = null;
        }
        B10(FX, uom);
        return FX.LIZ();
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void vn0(Context context, UOS identify, String value, Uri view, String name, boolean z, Uri uri, Boolean bool) {
        UOM uom;
        o.LJIIIZ(identify, "identify");
        o.LJIIIZ(value, "value");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(name, "name");
        C31220CNc FX = FX(context, view, name, z);
        if (uri != null && bool != null) {
            uom = new UOM(context, uri, this, bool.booleanValue());
        } else {
            uom = null;
        }
        n50(identify, value, FX, uom);
    }
}
