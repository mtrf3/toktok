package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.ss.android.ugc.aweme.share.dislike.FilteredKeywords;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Om0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62876Om0 {
    public static TuxSheet LJIIZILJ;
    public final C29S LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final TuxTextView LJ;
    public int LJFF;
    public final ChooseItemViewModel LJI;
    public final View LJII;
    public final C45631qh LJIIIIZZ;
    public final InterfaceC46330IGg LJIIIZ;
    public final AqS192S0100000_10 LJIIJ;
    public final C62878Om2 LJIIJJI;
    public final C62710OjK LJIIL;
    public final C62881Om5 LJIILIIL;
    public final C164176cP LJIILJJIL;
    public final C62879Om3 LJIILL;
    public final List<NewDislikeReason> LJIILLIIL;

    public final void LIZ() {
        FilteredKeywords filteredKeywords = ChooseReasonAPI.LJII;
        ChooseReasonAPI.LJII = null;
        if (filteredKeywords != null) {
            this.LJIIJ.invoke(filteredKeywords.getList(), Integer.valueOf(filteredKeywords.getCounts()));
            return;
        }
        AqS192S0100000_10 onSuccess = this.LJIIJ;
        o.LJIIIZ(onSuccess, "onSuccess");
        ChooseReasonAPI.LIZJ = onSuccess;
    }

    public final void LIZIZ() {
        String str;
        List<DislikeHashTag> LIZ = C62877Om1.LIZ(this.LIZIZ);
        NewDislikeReason newDislikeReason = C62877Om1.LIZLLL;
        if (newDislikeReason != null) {
            str = newDislikeReason.getText();
        } else {
            str = null;
        }
        if ((!LIZ.isEmpty()) && str != null) {
            this.LJIILL.LIZ.setVisibility(0);
            this.LJIILIIL.LIZIZ.setVisibility(0);
            C62879Om3 c62879Om3 = this.LJIILL;
            c62879Om3.getClass();
            FrameLayout frameLayout = c62879Om3.LIZ;
            View inflate = View.inflate(frameLayout.getContext(), R.layout.aek, null);
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.kae);
            TuxIconView tuxIconView = (TuxIconView) inflate.findViewById(R.id.kad);
            TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.kac);
            String string = inflate.getContext().getString(R.string.iv6);
            o.LJIIIIZZ(string, "content.context.getStrin…_dislike_hashtag_tooltip)");
            tuxTextView2.setText(Html.fromHtml(string));
            tuxTextView2.setTuxFont(c62879Om3.LJ);
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(c62879Om3.LJFF);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS45S0200000_10(c62879Om3, tuxTextView2, 36));
            inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(inflate);
            this.LJIILIIL.LIZIZ(LIZ);
        }
    }

    public final void LIZJ() {
        String str;
        List<DislikeHashTag> LIZ = C62877Om1.LIZ(this.LIZIZ);
        NewDislikeReason newDislikeReason = C62877Om1.LIZLLL;
        if (newDislikeReason != null) {
            str = newDislikeReason.getText();
        } else {
            str = null;
        }
        if ((!LIZ.isEmpty()) && str != null) {
            this.LJIILL.LIZ.setVisibility(0);
            C62879Om3 c62879Om3 = this.LJIILL;
            AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 231);
            c62879Om3.getClass();
            FrameLayout frameLayout = c62879Om3.LIZ;
            View inflate = View.inflate(frameLayout.getContext(), R.layout.aej, null);
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.kae);
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(c62879Om3.LJFF);
            TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.ka3);
            String string = inflate.getContext().getString(R.string.iv6);
            o.LJIIIIZZ(string, "content.context.getStrin…_dislike_hashtag_tooltip)");
            tuxTextView2.setText(Html.fromHtml(string));
            tuxTextView2.setTuxFont(c62879Om3.LJ);
            C71897SJp c71897SJp = (C71897SJp) inflate.findViewById(R.id.kab);
            c71897SJp.setOnCheckedChangeListener(new C62880Om4(c62879Om3, tuxTextView2));
            FrameLayout frameLayout2 = c62879Om3.LIZ;
            frameLayout2.setBackground(C04270Et.LIZIZ(frameLayout2.getContext(), R.drawable.ajc));
            C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS30S0100000_10(c71897SJp, 178));
            inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(inflate);
            c62879Om3.LIZJ = aqS176S0100000_10;
            this.LJIILIIL.LIZIZ(LIZ);
        }
    }

    public final void LIZLLL(int i) {
        Context LIZIZ;
        if (C84763XOl.LJIIIIZZ() != null) {
            LIZIZ = C84763XOl.LJIIIIZZ();
        } else {
            LIZIZ = EF7.LIZIZ();
        }
        if (!(LIZIZ instanceof Activity)) {
            return;
        }
        new C61996OUu(this.LIZ).LIZ(0);
        if (i != -2 && i != 0) {
            if (i != 2) {
                return;
            }
            C05L.LIZLLL(LIZIZ, R.string.iv8);
            return;
        }
        C05L.LIZLLL(LIZIZ, R.string.iv9);
    }

    public C62876Om0(C29S activity, Aweme aweme, String enterFrom, String enterMethod) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ = activity;
        this.LIZIZ = aweme;
        this.LIZJ = enterFrom;
        this.LIZLLL = enterMethod;
        this.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.ct, activity);
        ChooseItemViewModel chooseItemViewModel = (ChooseItemViewModel) ViewModelProviders.of(activity).get(ChooseItemViewModel.class);
        this.LJI = chooseItemViewModel;
        View inflate = View.inflate(activity, R.layout.aei, null);
        o.LJIIIIZZ(inflate, "inflate(activity, R.layo…eason_choose_sheet, null)");
        this.LJII = inflate;
        this.LJIIIIZZ = (C45631qh) inflate.findViewById(R.id.cbn);
        this.LJIIIZ = IWF.LJJLIIIIJ();
        this.LJIIJ = new AqS192S0100000_10(this, 54);
        View findViewById = inflate.findViewById(R.id.cbi);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.i…choose_reason_desc_title)");
        this.LJ = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cbh);
        o.LJIIIIZZ(findViewById2, "content.findViewById(R.i…ke_choose_reason_desc_ll)");
        this.LJIIJJI = new C62878Om2(activity, (LinearLayout) findViewById2);
        View findViewById3 = inflate.findViewById(R.id.cbg);
        o.LJIIIIZZ(findViewById3, "content.findViewById(R.i…_choose_reason_bottom_bt)");
        C62710OjK c62710OjK = new C62710OjK(activity, (LinearLayout) findViewById3);
        this.LJIIL = c62710OjK;
        View findViewById4 = inflate.findViewById(R.id.cbl);
        o.LJIIIIZZ(findViewById4, "content.findViewById(R.i…e_choose_reason_items_ll)");
        C62881Om5 c62881Om5 = new C62881Om5(activity, (LinearLayout) findViewById4);
        this.LJIILIIL = c62881Om5;
        View findViewById5 = inflate.findViewById(R.id.cbj);
        o.LJIIIIZZ(findViewById5, "content.findViewById(R.i…ike_choose_reason_header)");
        this.LJIILJJIL = new C164176cP(activity, (FrameLayout) findViewById5);
        View findViewById6 = inflate.findViewById(R.id.cbm);
        o.LJIIIIZZ(findViewById6, "content.findViewById(R.i…e_choose_reason_split_fl)");
        C62879Om3 c62879Om3 = new C62879Om3(activity, (FrameLayout) findViewById6);
        this.LJIILL = c62879Om3;
        c62881Om5.LIZIZ.setVisibility(8);
        c62879Om3.LIZ.setVisibility(8);
        chooseItemViewModel.getClass();
        chooseItemViewModel.LJLJJL = c62710OjK;
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 559);
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 229);
        ChooseReasonAPI.LIZLLL = aqS160S0100000_10;
        ChooseReasonAPI.LJ = aqS176S0100000_10;
        AqS160S0100000_10 aqS160S0100000_102 = new AqS160S0100000_10(this, 560);
        AqS176S0100000_10 aqS176S0100000_102 = new AqS176S0100000_10(this, 230);
        ChooseReasonAPI.LJFF = aqS160S0100000_102;
        ChooseReasonAPI.LJI = aqS176S0100000_102;
        C62877Om1.LJFF = new ArrayList();
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(C62877Om1.LJ);
        while (LJJIIJZLJL.hasNext()) {
            NewDislikeReason newDislikeReason = (NewDislikeReason) LJJIIJZLJL.next();
            if (TextUtils.equals(newDislikeReason.getId(), C62877Om1.LIZJ)) {
                C62877Om1.LIZLLL = newDislikeReason;
            } else {
                List<NewDislikeReason> list = C62877Om1.LJFF;
                if (list != null) {
                    ((ArrayList) list).add(newDislikeReason);
                }
            }
        }
        C62885Om9.LIZ = new AtomicInteger(0);
        List<NewDislikeReason> list2 = C62877Om1.LJFF;
        this.LJIILLIIL = list2 == null ? new ArrayList<>() : list2;
    }
}
