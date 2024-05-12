package Y;

import X.ASL;
import X.C00F;
import X.C102003zQ;
import X.C110614Vt;
import X.C118604l6;
import X.C16880lQ;
import X.C19N;
import X.C28112B1o;
import X.C47261Igj;
import X.C59082To;
import X.C61328O5c;
import X.EnumC101413yT;
import X.ORZ;
import X.SY4;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.SaveNewCardViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfoContent;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS13S2000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCSpanS0S0200000_1 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
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
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
                updateDrawState$2(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS0S0200000_1 iDCSpanS0S0200000_1, View view) {
        int i;
        o.LJIIIZ(view, "view");
        FragmentManager fragmentManager = ((ProfileAigcIntroFragment) iDCSpanS0S0200000_1.l0).getFragmentManager();
        if (fragmentManager != null) {
            ProfileAigcIntroFragment profileAigcIntroFragment = (ProfileAigcIntroFragment) iDCSpanS0S0200000_1.l0;
            Context it = (Context) iDCSpanS0S0200000_1.l1;
            profileAigcIntroFragment.LJLJL = true;
            o.LJIIIIZZ(it, "it");
            IDDListenerS141S0100000_1 iDDListenerS141S0100000_1 = new IDDListenerS141S0100000_1(profileAigcIntroFragment, 1);
            if (C00F.LIZ(31744, 0, "aigc_avatar_setting", true) == 1) {
                i = R.string.dd;
            } else {
                i = R.string.dh;
            }
            String string = it.getString(R.string.dc);
            o.LJIIIIZZ(string, "context.getString(R.stri…GC_introPage_terms_body1)");
            String string2 = it.getString(i);
            o.LJIIIIZZ(string2, "context.getString(termsBody2StringRes)");
            String string3 = it.getString(R.string.de);
            o.LJIIIIZZ(string3, "context.getString(R.stri…GC_introPage_terms_body3)");
            List LJJIJIL = C47261Igj.LJJIJIL(C118604l6.LIZ(it, string), C118604l6.LIZ(it, string2), C118604l6.LIZ(it, string3));
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c3d, C16880lQ.LLZIL(it), null);
            ViewGroup viewGroup = (ViewGroup) LLLZIIL.findViewById(R.id.bt7);
            Iterator it2 = LJJIJIL.iterator();
            while (it2.hasNext()) {
                viewGroup.addView((View) it2.next());
            }
            SY4 sy4 = (SY4) LLLZIIL.findViewById(R.id.buv);
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(LLLZIIL, 12));
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            sy4.setBackground(c110614Vt.LIZ(it));
            ASL asl = new ASL();
            asl.LIZ.LJLLI = LLLZIIL;
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJLILLLLZI = iDDListenerS141S0100000_1;
            tuxSheet.show(fragmentManager, "profile_aigc_term_detail_tag");
            profileAigcIntroFragment.LJLJLJ = tuxSheet;
        }
    }

    public static final void onClick$1(IDCSpanS0S0200000_1 iDCSpanS0S0200000_1, View view) {
        SaveDisplayInfoContent saveDisplayInfoContent;
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        CCDCAddCardViewModel viewModel = ((SaveNewCardViewHolder) iDCSpanS0S0200000_1.l0).getViewModel();
        List<SaveDisplayInfoContent> list = ((C59082To) iDCSpanS0S0200000_1.l1).LJLILLLLZI.content;
        if (list != null) {
            saveDisplayInfoContent = (SaveDisplayInfoContent) ORZ.LJLLLL(list);
        } else {
            saveDisplayInfoContent = null;
        }
        viewModel.getClass();
        if (saveDisplayInfoContent != null && (str = saveDisplayInfoContent.title) != null && (str2 = saveDisplayInfoContent.desc) != null) {
            viewModel.setState(new AqS13S2000000_12(str, str2, 1));
        }
        C28112B1o.LIZLLL("learn_more_save_card", null, 30);
    }

    public static final void onClick$2(IDCSpanS0S0200000_1 iDCSpanS0S0200000_1, View widget) {
        o.LJIIIZ(widget, "widget");
        SmartRouter.buildRoute(((C102003zQ) iDCSpanS0S0200000_1.l0).getContext(), "aweme://chatcontrol/setting").open();
        if (((EnumC101413yT) iDCSpanS0S0200000_1.l1) == EnumC101413yT.O18) {
            ((C102003zQ) iDCSpanS0S0200000_1.l0).LIZ(true);
        } else {
            ((C102003zQ) iDCSpanS0S0200000_1.l0).LIZ(false);
        }
    }

    public static final void updateDrawState$0(IDCSpanS0S0200000_1 iDCSpanS0S0200000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS0S0200000_1 iDCSpanS0S0200000_1, TextPaint ds) {
        int i;
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        Integer LIZIZ = C19N.LIZIZ(((SaveNewCardViewHolder) iDCSpanS0S0200000_1.l0).itemView, "itemView.context", R.attr.bx);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = -16776961;
        }
        ds.setColor(i);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS0S0200000_1 iDCSpanS0S0200000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public IDCSpanS0S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
