package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.IDqS12S0400000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112874br implements InterfaceC41771GaN {
    public static final int LJIIIZ = (int) C1DF.LJIIIIZZ(40);
    public final InterfaceC112854bp LIZ;
    public final View LIZIZ;
    public final InterfaceC88472Yns<C109544Rq, C76800UCe> LIZJ;
    public final C62822Ol8 LIZLLL;
    public C109544Rq LJ;
    public final C62822Ol8 LJFF;
    public C112974c1 LJI;
    public C99033ud LJII;
    public InterfaceC113014c5 LJIIIIZZ;

    @Override // X.InterfaceC41771GaN
    public final void LIZ(C118004k8 result) {
        o.LJIIIZ(result, "result");
    }

    @Override // X.InterfaceC41771GaN
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC41771GaN
    public final void LIZJ(C117914jz c117914jz) {
    }

    public final C112884bs LJ() {
        return (C112884bs) this.LIZLLL.getValue();
    }

    public final void LJIIJJI() {
        String str;
        String str2;
        InterfaceC113014c5 interfaceC113014c5 = this.LJIIIIZZ;
        if (interfaceC113014c5 instanceof C112864bq) {
            str = "ErrorState";
        } else if (interfaceC113014c5 instanceof C112924bw) {
            str = "FinalImageState";
        } else if (o.LJ(interfaceC113014c5, C113024c6.LIZ)) {
            str = "LoadingState";
        } else if (interfaceC113014c5 instanceof C112934bx) {
            str = "TikTokLogoPlaceholderState";
        } else if (interfaceC113014c5 instanceof C112984c2) {
            str = "UploadState";
        } else {
            throw new C162476Zf();
        }
        InterfaceC112854bp interfaceC112854bp = this.LIZ;
        if (o.LJ(interfaceC112854bp, C4XA.LIZ)) {
            str2 = "photo";
        } else if (o.LJ(interfaceC112854bp, C4XB.LIZ)) {
            str2 = "video";
        } else {
            throw new C162476Zf();
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("media_thumbnail_final_state", C113554cx.LJJL(new OSZ("state", str), new OSZ(WM7.SCENE_SERVICE, str2)));
    }

    public final void LJIIL() {
        Integer num;
        C109544Rq c109544Rq = this.LJ;
        if (c109544Rq == null) {
            return;
        }
        Iterable iterable = (Iterable) this.LJFF.getValue();
        C109544Rq c109544Rq2 = this.LJ;
        if (c109544Rq2 != null) {
            num = Integer.valueOf(c109544Rq2.getMsgStatus());
        } else {
            num = null;
        }
        if (ORZ.LJLJJI(num, iterable)) {
            String uuid = c109544Rq.getUuid();
            o.LJIIIIZZ(uuid, "msg.uuid");
            C117874jv.LIZ(this, uuid);
        }
    }

    public final void LJIIIIZZ(List<ResolutionComponent> list) {
        Object obj;
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ResolutionComponent resolutionComponent = (ResolutionComponent) obj;
                if (resolutionComponent.height != 0 && resolutionComponent.width != 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LJ().LIZJ.setResolution((ResolutionComponent) obj);
    }

    public final void LJIIIZ(InterfaceC113014c5 interfaceC113014c5) {
        this.LJIIIIZZ = interfaceC113014c5;
        C112884bs LJ = LJ();
        View view = LJ.LJIIIIZZ;
        if (view != null) {
            view.setVisibility(8);
        }
        C5GC c5gc = LJ.LJIIIZ;
        if (c5gc != null) {
            c5gc.setVisibility(8);
        }
        LJ.LJIIJ.setVisibility(8);
        LJ.LJIIL.setVisibility(8);
        LJ.LJIIJJI.setVisibility(8);
        if (interfaceC113014c5 instanceof C112984c2) {
            C5GC c5gc2 = LJ().LJIIIZ;
            if (c5gc2 != null) {
                c5gc2.setVisibility(0);
            }
            C5GC c5gc3 = LJ().LJIIIZ;
            if (c5gc3 != null) {
                c5gc3.setProgress(((C112984c2) interfaceC113014c5).LIZ);
                return;
            }
            return;
        }
        if (interfaceC113014c5 instanceof C112934bx) {
            LIZLLL(((C112934bx) interfaceC113014c5).LIZ, interfaceC113014c5);
            return;
        }
        if (interfaceC113014c5 instanceof C112864bq) {
            LJ().LIZLLL.setActualImageResource(0);
            LJ().LJIIL.setVisibility(0);
            Object value = LJ().LJIILL.getValue();
            o.LJIIIIZZ(value, "<get-errorText>(...)");
            C112864bq c112864bq = (C112864bq) interfaceC113014c5;
            ((TextView) value).setText(c112864bq.LIZ);
            InterfaceC112844bo interfaceC112844bo = c112864bq.LIZIZ;
            if (interfaceC112844bo instanceof C112834bn) {
                C62846OlW LIZIZ = LJ().LIZIZ();
                Drawable drawable = ((C112834bn) interfaceC112844bo).LIZ;
                int i = LJIIIZ;
                C86793Y4n.LJJIJLIJ(i, i, LIZIZ);
                LIZIZ.setImageDrawable(drawable);
                LJ().LIZIZ().setVisibility(0);
                return;
            }
            if (!(interfaceC112844bo instanceof C112944by)) {
                return;
            }
            C112944by c112944by = (C112944by) interfaceC112844bo;
            IconTypeComponent iconTypeComponent = c112944by.LIZ.iconType;
            int[] iArr = C112904bu.LIZIZ;
            if (iArr[iconTypeComponent.ordinal()] == 1) {
                LJ().LIZIZ().setVisibility(8);
                LJ().LJIIJJI.setVisibility(0);
            } else {
                LJ().LIZIZ().setVisibility(0);
            }
            switch (iArr[c112944by.LIZ.iconType.ordinal()]) {
                case 1:
                    LJ().LJIIJJI.setVisibility(0);
                    return;
                case 2:
                    ImageComponent imageComponent = c112944by.LIZ;
                    ResolutionComponent resolutionComponent = imageComponent.resolution;
                    if (resolutionComponent != null) {
                        C86793Y4n.LJJIJLIJ(resolutionComponent.width, resolutionComponent.height, LJ().LIZIZ());
                    }
                    C4AS.LJII(LJ().LIZIZ(), C78934UyQ.LJJIIJ(C79081V1x.LJIIL(imageComponent)), this.LIZ.getScene(), null, null, 0, 0, 504);
                    return;
                case 3:
                case 4:
                    C62846OlW LIZIZ2 = LJ().LIZIZ();
                    SY9 LIZ = C112824bm.LIZ.LIZ(LJ().LIZ());
                    int i2 = LJIIIZ;
                    C86793Y4n.LJJIJLIJ(i2, i2, LIZIZ2);
                    LIZIZ2.setImageDrawable(LIZ);
                    return;
                case 5:
                case 6:
                    C62846OlW LIZIZ3 = LJ().LIZIZ();
                    SY9 LIZ2 = this.LIZ.LIZ().LIZ(LJ().LIZ());
                    int i3 = LJIIIZ;
                    C86793Y4n.LJJIJLIJ(i3, i3, LIZIZ3);
                    LIZIZ3.setImageDrawable(LIZ2);
                    return;
                default:
                    return;
            }
        }
        if (o.LJ(interfaceC113014c5, C113024c6.LIZ)) {
            LJ().LIZLLL.setActualImageResource(0);
            LJ().LJIIJJI.setVisibility(0);
        } else {
            if (!(interfaceC113014c5 instanceof C112924bw)) {
                return;
            }
            LIZLLL(((C112924bw) interfaceC113014c5).LIZ, interfaceC113014c5);
        }
    }

    public final void LJIIJ(boolean z) {
        if (!z) {
            LJ().LJ.setVisibility(8);
            LJ().LIZJ.setVisibility(0);
            LJ().LJ.setVisibility(8);
            LJ().LIZJ.setStyle(EnumC112964c0.DEFAULT);
            return;
        }
        if (((Boolean) C53181Ku1.LIZJ.getValue()).booleanValue()) {
            LJ().LJ.setVisibility(0);
            LJ().LIZJ.setVisibility(8);
            LJ().LJFF.setVisibility(0);
            LJ().LJI.setText(LJ().LIZ().getString(R.string.eq5));
        }
        if (((Boolean) C53181Ku1.LIZLLL.getValue()).booleanValue()) {
            LJ().LJ.setVisibility(0);
            LJ().LIZJ.setVisibility(0);
            LJ().LJFF.setVisibility(8);
            LJ().LIZJ.setStyle(EnumC112964c0.NUDE_MASK);
            LJ().LJI.setText(LJ().LIZ().getString(R.string.eql));
        }
    }

    @Override // X.InterfaceC41771GaN
    public final void onFailed(String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        LJIIIZ(new C112924bw(EnumC112954bz.NO_MASK));
    }

    @Override // X.InterfaceC41771GaN
    public final void onProgress(int i) {
        if (i >= 0) {
            LJIIIZ(new C112984c2(O6R.LJJIIZ(i * 0.99f)));
        }
    }

    public final void LIZLLL(EnumC112954bz enumC112954bz, InterfaceC113014c5 interfaceC113014c5) {
        String string;
        TextComponent textComponent;
        int i = C112904bu.LIZ[enumC112954bz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJ().LJII.setVisibility(0);
                View view = LJ().LJIIIIZZ;
                if (view != null) {
                    view.setVisibility(8);
                }
                LJ().LJIIJ.setVisibility(8);
                LJ().LJIILJJIL.setVisibility(0);
                return;
            }
            LJ().LJIILIIL.setVisibility(0);
            LJ().LJIILJJIL.setVisibility(0);
            TuxTextView tuxTextView = LJ().LJIILIIL;
            C112974c1 c112974c1 = this.LJI;
            if (c112974c1 == null || (textComponent = c112974c1.LJLILLLLZI) == null || (string = textComponent.text) == null || string.length() == 0) {
                string = LJ().LIZ().getString(R.string.eos);
            }
            tuxTextView.setText(string);
            return;
        }
        LJ().LJIILIIL.setVisibility(8);
        LJ().LJIILJJIL.setVisibility(8);
        LJ().LJII.setVisibility(8);
        if (interfaceC113014c5 instanceof C112934bx) {
            LJ().LJIIJ.setVisibility(0);
        }
        View view2 = LJ().LJIIIIZZ;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    public final boolean LJII(View.OnClickListener clickListener, View view) {
        int i;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(clickListener, "clickListener");
        C109544Rq c109544Rq = this.LJ;
        if (c109544Rq != null && C78897Uxp.LJJIJIL(c109544Rq) && C53181Ku1.LIZ()) {
            if (this.LJ != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LJ(R.string.eqm);
                c26227ARb.LIZ(R.string.eql);
                UC0.LIZJ(c26227ARb, new AqS105S0300000_1(clickListener, view, this, 15));
                c26227ARb.LJI().LIZLLL();
                C99033ud c99033ud = this.LJII;
                if (c99033ud != null) {
                    i = c99033ud.getChatType();
                } else {
                    i = -1;
                }
                C772831o.LIZ().LIZIZ("show_sensitive_content_prompt", C113554cx.LJJL(new OSZ("enter_from", "chat"), new OSZ("chat_type", C98583tu.LIZIZ(i))));
            }
            return true;
        }
        InterfaceC113014c5 interfaceC113014c5 = this.LJIIIIZZ;
        if (interfaceC113014c5 instanceof C112864bq) {
            ((C112864bq) interfaceC113014c5).LIZJ.invoke();
        } else {
            if (interfaceC113014c5 instanceof C112924bw) {
                return false;
            }
            if (!o.LJ(interfaceC113014c5, C113024c6.LIZ)) {
                if (interfaceC113014c5 instanceof C112934bx) {
                    return false;
                }
                if (!(interfaceC113014c5 instanceof C112984c2)) {
                    throw new C162476Zf();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C112874br(InterfaceC112854bp interfaceC112854bp, View itemView, InterfaceC88472Yns<? super C109544Rq, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(itemView, "itemView");
        this.LIZ = interfaceC112854bp;
        this.LIZIZ = itemView;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1007));
        this.LJFF = C221108m2.LIZIZ(C4XC.LJLIL);
        this.LJIIIIZZ = C113024c6.LIZ;
    }

    public final void LJFF(C109544Rq c109544Rq, UrlModel urlModel, EnumC112954bz enumC112954bz) {
        LJIIIZ(C113024c6.LIZ);
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJ = LJ().LIZLLL;
        if (enumC112954bz == EnumC112954bz.SAFETY_MASK) {
            LJII.LJIL = new MHO(20, 0);
        } else if (enumC112954bz == EnumC112954bz.NUDE_MASK) {
            LJII.LJIILL(new C80934Vpa());
        }
        C43659HBn.LJIILIIL(LJII, EnumC61782be.DEFAULT);
        LJII.LIZLLL(new C81929WDl(this.LIZ.getScene(), false, null, new C112894bt(this, enumC112954bz), new IDqS12S0400000_1(c109544Rq, urlModel, enumC112954bz, this, 1), 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C109544Rq r8, X.C112974c1 r9, java.util.List<java.lang.String> r10, boolean r11, boolean r12, X.C99033ud r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112874br.LJI(X.4Rq, X.4c1, java.util.List, boolean, boolean, X.3ud):void");
    }
}
