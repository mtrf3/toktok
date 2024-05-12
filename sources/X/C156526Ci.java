package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.text.Layout;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ci */
/* loaded from: classes3.dex */
public final class C156526Ci extends C6BL implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final C82622Wbi LLI;
    public String LLIFFJFJJ;
    public InteractStickerStruct LLII;
    public InterfaceC156676Cx LLIIII;
    public final C82632Wbs LLIIIILZ;

    static {
        TBT tbt = new TBT(C156526Ci.class, "locationStickerApi", "getLocationStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/location/EditLocationStickerApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C6BL
    public final int LJIIJ() {
        return 0;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 22;
    }

    @Override // X.C6BL
    public final void LJJII() {
        this.LLII = null;
        super.LJJII();
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLII != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        return ((C63L) this.LLIIIILZ.LIZ(this, LLIIIJ[0])).LJIIIIZZ();
    }

    public static final String LJJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pi_start");
        LIZ.append(UUID.randomUUID());
        LIZ.append("pi_end");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        float f;
        int i;
        boolean z;
        Integer num;
        String str;
        PoiStickerStruct poiStickerStruct;
        PoiStickerStruct poiStickerStruct2 = null;
        if (!LJIILLIIL() || this.LJLL == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(22);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(C6BL.LJIILJJIL(this.LJLL.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.LJLL.getScale()));
        PointF LIZIZ = LIZIZ(this.LJLL.getCenterViewPoint());
        normalTrackTimeStamp.setX(LIZIZ.x);
        normalTrackTimeStamp.setY(LIZIZ.y);
        C156426By c156426By = this.LJLL;
        if (!(c156426By instanceof C156626Cs)) {
            c156426By = null;
        }
        float f2 = 0.0f;
        if (c156426By != null) {
            f = c156426By.getStartTime();
        } else {
            f = 0.0f;
        }
        normalTrackTimeStamp.setStartTime(f);
        C156426By c156426By2 = this.LJLL;
        if ((c156426By2 instanceof C156626Cs) && c156426By2 != null) {
            f2 = c156426By2.getEndTime();
        }
        normalTrackTimeStamp.setEndTime(f2);
        PointF LIZIZ2 = LIZIZ(new PointF(this.LJLL.getContentViewWidth(), this.LJLL.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(LIZIZ2.x);
        normalTrackTimeStamp.setHeight(LIZIZ2.y);
        linkedList.add(normalTrackTimeStamp);
        C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
        C156426By c156426By3 = this.LJLL;
        o.LJII(c156426By3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.location.LocationStickerInteractView");
        Layout layout = ((C156626Cs) c156426By3).LLIIJI.getLayout();
        if (layout != null) {
            i = layout.getEllipsisCount(0);
        } else {
            i = 0;
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        OSZ[] oszArr = new OSZ[2];
        InteractStickerStruct interactStickerStruct2 = this.LLII;
        if (interactStickerStruct2 != null && (poiStickerStruct = interactStickerStruct2.getPoiStickerStruct()) != null) {
            num = Integer.valueOf(poiStickerStruct.getStickerTheme());
        } else {
            num = null;
        }
        oszArr[0] = new OSZ("sticker_type", num);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("is_cut_off", str);
        interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), C113554cx.LJJJLZIJ(oszArr)));
        InteractStickerStruct interactStickerStruct3 = this.LLII;
        if (interactStickerStruct3 != null) {
            poiStickerStruct2 = interactStickerStruct3.getPoiStickerStruct();
        }
        interactStickerStruct.setPoiStickerStruct(poiStickerStruct2);
        return interactStickerStruct;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LLI;
    }

    public C156526Ci(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LLI = diContainer;
        this.LLIIIILZ = UCI.LJI(diContainer, C63L.class, null);
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        C156626Cs c156626Cs = new C156626Cs(context, this.LLI);
        c156626Cs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c156626Cs.setController$tools_camera_edit_release(this);
        c156626Cs.setLockMode(true);
        InterfaceC156676Cx interfaceC156676Cx = this.LLIIII;
        if (interfaceC156676Cx != null) {
            c156626Cs.setEditLocationListener$tools_camera_edit_release(interfaceC156676Cx);
        }
        return c156626Cs;
    }

    @Override // X.C6BL
    public final void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.postDelayed(new ARunnableS21S0200000_2(interactStickerStruct, this, 70), 300L);
        }
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By c156426By) {
        if (c156426By instanceof C156626Cs) {
            this.LLII = null;
            return super.LJJIII(c156426By);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r5 != null) goto L33;
     */
    @Override // X.C6BL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = X.C38354F3m.LJ(r5)
            if (r0 != 0) goto L2b
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L50
            java.lang.String r0 = "pi_start"
            boolean r0 = ujb.s.LJJJLZIJ(r5, r0, r2)
            if (r0 != r3) goto L2e
            java.lang.String r0 = "pi_end"
            boolean r0 = ujb.s.LJJJLZIJ(r5, r0, r2)
            if (r0 == 0) goto L2c
            X.OJD r1 = new X.OJD
            java.lang.String r0 = "pi_start(.*?)pi_end"
            r1.<init>(r0)
            java.lang.String r0 = LJJIL()
            java.lang.String r0 = r1.replace(r5, r0)
            r4.LJLLLL = r0
        L2b:
            return
        L2c:
            if (r5 == 0) goto L50
        L2e:
            java.lang.String r1 = java.io.File.separator
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = ujb.o.LJJJJ(r5, r1, r2)
            if (r0 != r3) goto L50
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r5)
            java.lang.String r0 = LJJIL()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.LJLLLL = r0
            goto L2b
        L50:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r5)
            java.lang.String r0 = LJJIL()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.LJLLLL = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156526Ci.LJJIJ(java.lang.String):void");
    }

    @Override // X.C6BL
    public final void LJIJ(Context context, FrameLayout frameLayout) {
        super.LJIJ(context, frameLayout);
        this.LLFF = false;
    }

    public final void LJJIZ(InteractStickerStruct data, boolean z, boolean z2) {
        int i;
        int i2;
        PoiStickerStruct poiStickerStruct;
        PoiStickerStruct poiStickerStruct2;
        PoiStickerStruct poiStickerStruct3;
        PoiStickerStruct poiStickerStruct4;
        PoiStickerStruct poiStickerStruct5;
        C156626Cs c156626Cs;
        o.LJIIIZ(data, "data");
        if (z2) {
            LJJII();
            this.LLII = data;
        } else {
            InteractStickerStruct interactStickerStruct = this.LLII;
            int i3 = 0;
            if (interactStickerStruct != null && (poiStickerStruct5 = interactStickerStruct.getPoiStickerStruct()) != null) {
                i = poiStickerStruct5.getStartTime();
            } else {
                i = 0;
            }
            InteractStickerStruct interactStickerStruct2 = this.LLII;
            if (interactStickerStruct2 != null && (poiStickerStruct4 = interactStickerStruct2.getPoiStickerStruct()) != null) {
                i3 = poiStickerStruct4.getEndTime();
            }
            InteractStickerStruct interactStickerStruct3 = this.LLII;
            if (interactStickerStruct3 != null && (poiStickerStruct3 = interactStickerStruct3.getPoiStickerStruct()) != null) {
                i2 = poiStickerStruct3.getStickerTheme();
            } else {
                i2 = 1;
            }
            LJJII();
            this.LLII = data;
            PoiStickerStruct poiStickerStruct6 = data.getPoiStickerStruct();
            if (poiStickerStruct6 != null) {
                poiStickerStruct6.setStartTime(i);
            }
            InteractStickerStruct interactStickerStruct4 = this.LLII;
            if (interactStickerStruct4 != null && (poiStickerStruct2 = interactStickerStruct4.getPoiStickerStruct()) != null) {
                poiStickerStruct2.setEndTime(i3);
            }
            InteractStickerStruct interactStickerStruct5 = this.LLII;
            if (interactStickerStruct5 != null && (poiStickerStruct = interactStickerStruct5.getPoiStickerStruct()) != null) {
                poiStickerStruct.setStickerTheme(i2);
            }
        }
        LIZLLL(z2);
        C156426By c156426By = this.LJLL;
        if ((c156426By instanceof C156626Cs) && (c156626Cs = (C156626Cs) c156426By) != null) {
            c156626Cs.setVisibility(4);
            c156626Cs.LLIIJI.setLocationStickerData$tools_camera_edit_release(data);
            if (z) {
                c156626Cs.post(new ARunnableS38S0100000_2(c156626Cs, 201));
            }
        }
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LJII();
        }
    }
}
