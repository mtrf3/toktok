package Y;

import X.ARI;
import X.C113554cx;
import X.C26227ARb;
import X.C32I;
import X.C62562cu;
import X.C70307RiZ;
import X.C70388Rjs;
import X.C70757Rpp;
import X.C70796RqS;
import X.C70942Rso;
import X.C72014SOc;
import X.C72016SOe;
import X.C72571Sdz;
import X.C76542zS;
import X.C78946Uyc;
import X.InterfaceC70286RiE;
import X.InterfaceC72575Se3;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.SFD;
import X.SY4;
import X.TCU;
import X.TCW;
import X.XXG;
import X.XXW;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.business.agegate.coarsetonarrow.AgeGateCTNViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.gallery.GalleryUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS28S0201000_12 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        switch (aCListenerS28S0201000_12.i2) {
            case 0:
                XXG xxg = (XXG) aCListenerS28S0201000_12.l0;
                XXW xxw = (XXW) aCListenerS28S0201000_12.l1;
                xxg.LLIIIZ.setChecked(!xxw.LJIILLIIL);
                xxw.LJIILLIIL = !xxw.LJIILLIIL;
                xxg.onClick(view.findViewById(R.id.c9s));
                return;
            default:
                final StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aCListenerS28S0201000_12.l0;
                final NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) aCListenerS28S0201000_12.l1;
                stickerPropDetailFragment.getClass();
                ARI ari = new ARI(stickerPropDetailFragment.requireContext());
                ari.LJ(R.string.fyx, new InterfaceC88472Yns() { // from class: X.Fv8
                    @Override // X.InterfaceC88472Yns
                    public final Object invoke(Object obj) {
                        StickerPropDetailFragment stickerPropDetailFragment2 = StickerPropDetailFragment.this;
                        NewFaceStickerBean newFaceStickerBean2 = newFaceStickerBean;
                        stickerPropDetailFragment2.getClass();
                        MobileEffectViewModel mobileEffectViewModel = (MobileEffectViewModel) ViewModelProviders.of(stickerPropDetailFragment2).get(MobileEffectViewModel.class);
                        String effectId = newFaceStickerBean2.effectId;
                        int i = newFaceStickerBean2.effectSource;
                        mobileEffectViewModel.getClass();
                        o.LJIIIZ(effectId, "effectId");
                        XKX.LIZLLL(ViewModelKt.getViewModelScope(mobileEffectViewModel), null, null, new EQ8(mobileEffectViewModel, effectId, i, null), 3);
                        return C76800UCe.LIZ;
                    }
                });
                ari.LJIIIIZZ(R.string.fzb, null);
                C26227ARb c26227ARb = new C26227ARb(stickerPropDetailFragment.requireActivity());
                c26227ARb.LJII = false;
                c26227ARb.LJ(R.string.fz0);
                c26227ARb.LIZ(R.string.fyz);
                c26227ARb.LJIIL = ari;
                c26227ARb.LJI().LIZLLL();
                return;
        }
    }

    public static final void onClick$1(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        Image image = (Image) aCListenerS28S0201000_12.l0;
        if (image != null) {
            MiniPdpHeaderWidget miniPdpHeaderWidget = (MiniPdpHeaderWidget) aCListenerS28S0201000_12.l1;
            int i = aCListenerS28S0201000_12.i2;
            JediViewModel jediViewModel = (JediViewModel) miniPdpHeaderWidget.LJLILLLLZI.getValue();
            jediViewModel.getClass();
            jediViewModel.setState(new AqS99S0101000_12(i, image, 12));
            Map LJJLIL = C113554cx.LJJLIL(C70307RiZ.LIZ);
            LJJLIL.put("module_name", "head_pic");
            LJJLIL.put("rank", Integer.valueOf(i + 1));
            C76542zS.LIZ("tiktokec_module_click", LJJLIL);
            o.LJIIIIZZ(view, "view");
            C78946Uyc.LJJIIJ(view, new C70942Rso(), new AqS178S0100000_12(image, 167));
        }
    }

    public static final void onClick$2(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        TCU tcu = (TCU) aCListenerS28S0201000_12.l0;
        TCW tcw = (TCW) ListProtector.get((List) aCListenerS28S0201000_12.l1, aCListenerS28S0201000_12.i2);
        tcu.notifyDataSetChanged();
        tcu.LJLIL.LIZ(tcw);
    }

    public static final void onClick$3(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        Object obj;
        C62562cu imageUrlModel;
        List<String> list;
        InterfaceC70286RiE interfaceC70286RiE = ((C70757Rpp) aCListenerS28S0201000_12.l0).LJLJL;
        if (interfaceC70286RiE != null) {
            interfaceC70286RiE.LLIL();
        }
        C70757Rpp c70757Rpp = (C70757Rpp) aCListenerS28S0201000_12.l0;
        if (c70757Rpp.LJLL) {
            List<HeaderItem> list2 = c70757Rpp.LJLJLJ;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Integer num = ((HeaderItem) next).type;
                if (num != null && num.intValue() == 1) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Image image = ((HeaderItem) it2.next()).image;
                if (image == null || (imageUrlModel = image.toImageUrlModel()) == null || (list = imageUrlModel.LIZ) == null || (obj = ORZ.LJLLLLLL(0, list)) == null) {
                    obj = "";
                }
                arrayList2.add(obj);
            }
            Context context = ((ViewGroup) aCListenerS28S0201000_12.l1).getContext();
            if (context != null) {
                GalleryUtil.LIZ(context, aCListenerS28S0201000_12.i2, arrayList2.size(), arrayList2, null, null, null, new C70388Rjs((C70757Rpp) aCListenerS28S0201000_12.l0), null, 29680);
            }
        }
    }

    public static final void onClick$4(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        SFD sfd = (SFD) aCListenerS28S0201000_12.l0;
        if (!sfd.LJLJI) {
            sfd.LJLJI = true;
            ((SY4) aCListenerS28S0201000_12.l1).setTuxFont(42);
            ((SY4) aCListenerS28S0201000_12.l1).setBackground(((SFD) aCListenerS28S0201000_12.l0).getContext().getDrawable(R.drawable.ahr));
            ((SY4) aCListenerS28S0201000_12.l1).setTextColor(R.attr.cl);
            SFD sfd2 = (SFD) aCListenerS28S0201000_12.l0;
            sfd2.LJLILLLLZI.LIZ((String) ListProtector.get(sfd2.LJLIL, aCListenerS28S0201000_12.i2));
            ((AgeGateCTNViewModel) ((SFD) aCListenerS28S0201000_12.l0).LJLJJI.getValue()).gv0(1);
        }
    }

    public static final void onClick$5(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        C72016SOe.LIZ("confirm");
        ((C72014SOc) aCListenerS28S0201000_12.l0).LLIIIL(aCListenerS28S0201000_12.i2);
        ((TuxSheet) aCListenerS28S0201000_12.l1).dismiss();
    }

    public static final void onClick$6(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        View view2;
        View view3;
        if (((C70796RqS) aCListenerS28S0201000_12.l0).getReverseSelectionSupport()) {
            if (!o.LJ(((C70796RqS) aCListenerS28S0201000_12.l0).LJLILLLLZI, view) && (view3 = ((C70796RqS) aCListenerS28S0201000_12.l0).LJLILLLLZI) != null) {
                view3.setSelected(false);
            }
            C70796RqS c70796RqS = (C70796RqS) aCListenerS28S0201000_12.l0;
            c70796RqS.LJLILLLLZI = view;
            if (!o.LJ(c70796RqS.LJLJI, view) && (view2 = ((C70796RqS) aCListenerS28S0201000_12.l0).LJLJI) != null) {
                view2.setSelected(false);
            }
            view.setSelected(!view.isSelected());
            if (view.isSelected()) {
                InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS28S0201000_12.l1;
                Integer valueOf = Integer.valueOf(aCListenerS28S0201000_12.i2);
                Object tag = view.getTag();
                o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct");
                interfaceC88471Ynr.invoke(valueOf, tag);
                return;
            }
            ((InterfaceC88471Ynr) aCListenerS28S0201000_12.l1).invoke(-1, null);
            return;
        }
        if (o.LJ(view, ((C70796RqS) aCListenerS28S0201000_12.l0).LJLILLLLZI) || o.LJ(view, ((C70796RqS) aCListenerS28S0201000_12.l0).LJLJI)) {
            return;
        }
        View view4 = ((C70796RqS) aCListenerS28S0201000_12.l0).LJLILLLLZI;
        if (view4 != null) {
            view4.setSelected(false);
        }
        View view5 = ((C70796RqS) aCListenerS28S0201000_12.l0).LJLJI;
        if (view5 != null) {
            view5.setSelected(false);
        }
        C70796RqS c70796RqS2 = (C70796RqS) aCListenerS28S0201000_12.l0;
        c70796RqS2.LJLILLLLZI = view;
        c70796RqS2.LJLJI = null;
        view.setSelected(true);
        InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) aCListenerS28S0201000_12.l1;
        Integer valueOf2 = Integer.valueOf(aCListenerS28S0201000_12.i2);
        Object tag2 = view.getTag();
        o.LJII(tag2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct");
        interfaceC88471Ynr2.invoke(valueOf2, tag2);
    }

    public static final void onClick$7(ACListenerS28S0201000_12 aCListenerS28S0201000_12, View view) {
        C72571Sdz c72571Sdz = (C72571Sdz) aCListenerS28S0201000_12.l0;
        c72571Sdz.notifyItemChanged(c72571Sdz.LJLJL.invoke((InterfaceC72575Se3) aCListenerS28S0201000_12.l1).intValue());
        ((C72571Sdz) aCListenerS28S0201000_12.l0).LJLJJL.LJJL((InterfaceC72575Se3) aCListenerS28S0201000_12.l1);
        ((C72571Sdz) aCListenerS28S0201000_12.l0).notifyItemChanged(aCListenerS28S0201000_12.i2);
    }

    public ACListenerS28S0201000_12(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
