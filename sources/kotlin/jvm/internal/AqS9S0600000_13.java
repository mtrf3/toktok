package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C47261Igj;
import X.C73320Sq4;
import X.C73440Ss0;
import X.C73461SsL;
import X.C73546Sti;
import X.C73605Suf;
import X.C73671Svj;
import X.C73897SzN;
import X.C73969T1h;
import X.C75786Tok;
import X.C76120Tu8;
import X.C76800UCe;
import X.C85999Xp5;
import X.EnumC75419Tip;
import X.InterfaceC65784Pro;
import X.InterfaceC75179Tex;
import X.InterfaceC75807Tp5;
import X.InterfaceC76125TuD;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.T16;
import X.U8M;
import X.U8Q;
import X.U8R;
import X.U8V;
import X.U9O;
import Y.AfS52S0300000_13;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class AqS9S0600000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S0600000_13 aqS9S0600000_13) {
        AbstractC73638SvC LJIJ;
        Object obj;
        String str;
        MicPositionInfo micPositionData;
        if (!((U8Q) aqS9S0600000_13.l0).LIZ((InterfaceC75807Tp5) aqS9S0600000_13.l1, (List) aqS9S0600000_13.l2) || !o.LJ(((U8Q) aqS9S0600000_13.l0).LJFF, (Bitmap) aqS9S0600000_13.l3)) {
            ((U8Q) aqS9S0600000_13.l0).LIZIZ.clear();
            ((U8Q) aqS9S0600000_13.l0).LIZIZ.addAll((List) aqS9S0600000_13.l2);
            U8Q u8q = (U8Q) aqS9S0600000_13.l0;
            u8q.LIZJ = (InterfaceC75807Tp5) aqS9S0600000_13.l1;
            C73546Sti c73546Sti = u8q.LJ;
            if (c73546Sti != null) {
                c73546Sti.dispose();
            }
            ((U8Q) aqS9S0600000_13.l0).LIZ.LJFF.removeAllWaterMarks();
            U8Q u8q2 = (U8Q) aqS9S0600000_13.l0;
            Bitmap bitmap = (Bitmap) aqS9S0600000_13.l3;
            u8q2.LJFF = bitmap;
            int i = 0;
            if (bitmap != null && !bitmap.isRecycled()) {
                U8M u8m = ((U8Q) aqS9S0600000_13.l0).LIZ.LJFF;
                Client.RTCWaterMarkRegion rTCWaterMarkRegion = new Client.RTCWaterMarkRegion();
                Bitmap bitmap2 = (Bitmap) aqS9S0600000_13.l3;
                rTCWaterMarkRegion.setX(0.0f);
                rTCWaterMarkRegion.setY(0.0f);
                rTCWaterMarkRegion.setW(1.0f);
                rTCWaterMarkRegion.setH(1.0f);
                rTCWaterMarkRegion.setImage(bitmap2);
                rTCWaterMarkRegion.setRenderMode(Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_HIDDEN);
                rTCWaterMarkRegion.setZorder(0);
                u8m.LJJIZ("mask_bg", rTCWaterMarkRegion);
            }
            if (((Layout) aqS9S0600000_13.l4).isFixedType() && ((Bitmap) aqS9S0600000_13.l3) == null) {
                ArrayList arrayList = new ArrayList(((Layout) aqS9S0600000_13.l4).getMicCount());
                ArrayList arrayList2 = new ArrayList();
                int micCount = ((Layout) aqS9S0600000_13.l4).getMicCount();
                if (micCount >= 0) {
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        List list = (List) aqS9S0600000_13.l2;
                        U8Q u8q3 = (U8Q) aqS9S0600000_13.l0;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                U8M u8m2 = u8q3.LIZ.LJFF;
                                String interactId = ((Region) obj).getInteractId();
                                o.LJIIIIZZ(interactId, "region.interactId");
                                OnLineMicInfo LJII = u8m2.LJII(interactId);
                                if (LJII != null && (micPositionData = LJII.getMicPositionData()) != null && micPositionData.getPosition() == i2) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (z || obj != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Map<String, Resolution> resolutionMap = ((Layout) aqS9S0600000_13.l4).getResolutionMap();
                        LayoutArray layoutByPosAndSize = ((Layout) aqS9S0600000_13.l4).getLayoutByPosAndSize(i2, ((U8Q) aqS9S0600000_13.l0).LIZ.LJFF.LJIIIIZZ());
                        if (layoutByPosAndSize != null) {
                            str = layoutByPosAndSize.getReso_id();
                        } else {
                            str = null;
                        }
                        Resolution resolution = resolutionMap.get(str);
                        if (obj == null && resolution != null) {
                            OSZ<Integer, Integer> h5 = ((InterfaceC75807Tp5) aqS9S0600000_13.l1).h5(resolution);
                            if (!arrayList.contains(Long.valueOf(h5.getSecond().longValue() * h5.getFirst().intValue()))) {
                                arrayList.add(Long.valueOf(h5.getSecond().longValue() * h5.getFirst().intValue()));
                                arrayList2.add(((U8Q) aqS9S0600000_13.l0).LIZLLL(h5.getFirst().intValue(), h5.getSecond().intValue()));
                            }
                        }
                        if (i2 == micCount) {
                            break;
                        }
                        i2++;
                    }
                }
                C73605Suf LJIIIIZZ = new C73440Ss0(AbstractC73672Svk.LJJLJ(arrayList2, C85999Xp5.LJLIL).LJIIZILJ(new U8R((Layout) aqS9S0600000_13.l4, (List) aqS9S0600000_13.l2, (U8Q) aqS9S0600000_13.l0, (InterfaceC88472Yns) aqS9S0600000_13.l5, (InterfaceC75807Tp5) aqS9S0600000_13.l1))).LJIIIIZZ();
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C73320Sq4.LIZ(c76800UCe, "completionValue is null");
                LJIJ = new C73461SsL(LJIIIIZZ, null, c76800UCe);
            } else {
                LJIJ = AbstractC73638SvC.LJIJ(C76800UCe.LIZ);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(LJIJ);
            List list2 = (List) aqS9S0600000_13.l2;
            InterfaceC75807Tp5 interfaceC75807Tp5 = (InterfaceC75807Tp5) aqS9S0600000_13.l1;
            U8Q u8q4 = (U8Q) aqS9S0600000_13.l0;
            for (Object obj2 : list2) {
                int i3 = i + 1;
                if (i >= 0) {
                    Region region = (Region) obj2;
                    String interactId2 = region.getInteractId();
                    o.LJIIIIZZ(interactId2, "region.interactId");
                    if (interfaceC75807Tp5.e5(i, interactId2)) {
                        String interactId3 = region.getInteractId();
                        o.LJIIIIZZ(interactId3, "region.interactId");
                        C73605Suf LJIIIIZZ2 = new C73671Svj(interfaceC75807Tp5.i5(i, interactId3).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIILIIL(new AfS52S0300000_13(interfaceC75807Tp5, region, u8q4, 9)).LJIIJ(new AfS62S0200000_13(u8q4, region, 64))).LJIIIIZZ();
                        C76800UCe c76800UCe2 = C76800UCe.LIZ;
                        C73320Sq4.LIZ(c76800UCe2, "completionValue is null");
                        arrayList3.add(new C73461SsL(LJIIIIZZ2, null, c76800UCe2));
                    }
                    i = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            ((U8Q) aqS9S0600000_13.l0).LJ = (C73546Sti) new C73671Svj(new C73897SzN(arrayList3).LJIJJ(C73969T1h.LIZIZ()).LJIIIIZZ(new AfS65S0100000_13((U8Q) aqS9S0600000_13.l0, 202))).LJIIIIZZ().LJIIJJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S0600000_13 aqS9S0600000_13) {
        int i;
        C76120Tu8 c76120Tu8 = (C76120Tu8) aqS9S0600000_13.l0;
        C75786Tok c75786Tok = (C75786Tok) aqS9S0600000_13.l1;
        if (c75786Tok != null) {
            i = c75786Tok.LJLIL;
        } else {
            i = 0;
        }
        InterfaceC76125TuD LJIILLIIL = c76120Tu8.LJIILLIIL(i, c76120Tu8.LJLJJI);
        if (LJIILLIIL != null) {
            LJIILLIIL.LLIIJLIL((InterfaceC75179Tex) aqS9S0600000_13.l2, (EnumC75419Tip) aqS9S0600000_13.l3, (EnumC75419Tip) aqS9S0600000_13.l4, (U9O) aqS9S0600000_13.l5, (C75786Tok) aqS9S0600000_13.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0600000_13(C76120Tu8 c76120Tu8, C75786Tok c75786Tok, InterfaceC75179Tex interfaceC75179Tex, EnumC75419Tip enumC75419Tip, EnumC75419Tip enumC75419Tip2, U9O u9o, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76120Tu8;
        this.l1 = c75786Tok;
        this.l2 = interfaceC75179Tex;
        this.l3 = enumC75419Tip;
        this.l4 = enumC75419Tip2;
        this.l5 = u9o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0600000_13(U8Q u8q, InterfaceC75807Tp5 interfaceC75807Tp5, List list, Bitmap bitmap, Layout layout, U8V u8v, int i) {
        super(0);
        this.$t = i;
        this.l0 = u8q;
        this.l1 = interfaceC75807Tp5;
        this.l2 = list;
        this.l3 = bitmap;
        this.l4 = layout;
        this.l5 = u8v;
    }
}
