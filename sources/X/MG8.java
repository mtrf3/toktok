package X;

import Y.ACListenerS29S0100000_9;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameAddCell;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* loaded from: classes10.dex */
public final class MG8 extends RecyclerView.ViewHolder implements InterfaceC49416JaO, G27 {
    public static int LLFFF;
    public static boolean LLFZ;
    public static int LLI;
    public static int LLIFFJFJJ;
    public final View LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final MGH LJLJJL;
    public final ArrayList<MixStruct> LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final SYL LJLLI;
    public final ConstraintLayout LJLLILLLL;
    public final FrameLayout LJLLJ;
    public final FrameLayout LJLLL;
    public final View LJLLLL;
    public MixListResponse LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public static final int LJZ = C17N.LJIILL(36.0d);
    public static final int LJZI = C17N.LJIILL(4.0d);
    public static final int LJZL = C7MY.LIZIZ(8);
    public static final int LL = C17N.LJIILL(40.5d);
    public static int LLD = C17N.LJIILL(88.0d);
    public static final int LLF = C17N.LJIILL(102.0d);
    public static final int LLFF = C17N.LJIILL(82.0d);
    public static boolean LLFII = true;
    public static int LLII = -1;

    public final List<InterfaceC57784Mm4> L(List<MixStruct> list) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (MixStruct mixStruct : list) {
                    MGD mgd = new MGD(0);
                    mixStruct.getIcon();
                    mgd.LJLIL = mixStruct.getMixName();
                    mgd.LJLILLLLZI = mixStruct.mixId;
                    String str5 = this.LJLJL;
                    o.LJIIIZ(str5, "<set-?>");
                    mgd.LJLJJI = str5;
                    String str6 = this.LJLJLJ;
                    o.LJIIIZ(str6, "<set-?>");
                    mgd.LJLJJL = str6;
                    mgd.LJLJLJ = this.LJLJI;
                    MixListResponse mixListResponse = this.LJLLLLLL;
                    String str7 = null;
                    if (mixListResponse != null) {
                        str = mixListResponse.getKeyWord();
                    } else {
                        str = null;
                    }
                    mgd.LJLJLLL = str;
                    MixListResponse mixListResponse2 = this.LJLLLLLL;
                    if (mixListResponse2 != null) {
                        str2 = mixListResponse2.getSearchId();
                    } else {
                        str2 = null;
                    }
                    mgd.LJLL = str2;
                    MixListResponse mixListResponse3 = this.LJLLLLLL;
                    if (mixListResponse3 != null) {
                        str3 = mixListResponse3.getSearchResultId();
                    } else {
                        str3 = null;
                    }
                    mgd.LJLLI = str3;
                    String str8 = this.LJLJJI;
                    o.LJIIIZ(str8, "<set-?>");
                    mgd.LJLJJLL = str8;
                    if (this.LJLJI) {
                        str4 = "click_search_card";
                    } else {
                        str4 = "click_profile_card";
                    }
                    mgd.LJLJL = str4;
                    mgd.LJLLJ = this.LJLJJL;
                    MixListResponse mixListResponse4 = this.LJLLLLLL;
                    if (mixListResponse4 != null) {
                        str7 = mixListResponse4.getSearchType();
                    }
                    mgd.LJLLILLLL = str7;
                    arrayList.add(mgd);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0010, code lost:
    
        r0 = X.C53946LFe.LIZJ(r6, null).LIZIZ;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(int r10) {
        /*
            r9 = this;
            X.MG8.LLII = r10
            android.view.View r0 = r9.LJLIL
            java.lang.String r5 = "view.context"
            android.app.Activity r6 = X.FT5.LIZ(r0, r5)
            r4 = 0
            r8 = 1
            r7 = 0
            if (r6 != 0) goto L47
            r0 = 0
        L10:
            X.MG8.LLIFFJFJJ = r0
            android.view.View r0 = r9.LJLIL
            android.app.Activity r2 = X.FT5.LIZ(r0, r5)
            if (r2 == 0) goto L3e
            X.LFH r1 = X.LFH.LIZIZ
            X.LEp r0 = r1.LIZLLL()
            r0.LJIIZILJ()
            X.LEZ r0 = X.LEZ.LIZ
            boolean r0 = r0.LIZIZ(r2, r4)
            if (r0 == 0) goto L3e
            int r2 = X.MG8.LLIFFJFJJ
            X.LEp r0 = r1.LIZLLL()
            r0.LJIIZILJ()
            r0 = 60
            double r0 = (double) r0
            int r0 = X.C17N.LJIILL(r0)
            int r2 = r2 - r0
            X.MG8.LLIFFJFJJ = r2
        L3e:
            boolean r1 = r9.LJLILLLLZI
            int r0 = r10 + r1
            X.MG8.LLI = r0
            if (r10 != 0) goto L86
            return
        L47:
            int r1 = r6.getRequestedOrientation()     // Catch: android.os.DeadSystemException -> L7f
            android.content.res.Resources r0 = r6.getResources()     // Catch: android.os.DeadSystemException -> L7f
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: android.os.DeadSystemException -> L7f
            int r0 = r0.orientation     // Catch: android.os.DeadSystemException -> L7f
            if (r1 == r0) goto L7f
            android.content.Context r0 = X.C16880lQ.LLLLJ(r6)     // Catch: android.os.DeadSystemException -> L7f
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.os.DeadSystemException -> L7f
            android.util.DisplayMetrics r3 = r0.getDisplayMetrics()     // Catch: android.os.DeadSystemException -> L7f
            java.lang.String r0 = "applicationContext.resources.displayMetrics"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)     // Catch: android.os.DeadSystemException -> L7f
            r2 = 2
            int[] r1 = new int[r2]     // Catch: android.os.DeadSystemException -> L7f
            int r0 = r3.widthPixels     // Catch: android.os.DeadSystemException -> L7f
            r1[r7] = r0     // Catch: android.os.DeadSystemException -> L7f
            int r0 = r3.heightPixels     // Catch: android.os.DeadSystemException -> L7f
            r1[r8] = r0     // Catch: android.os.DeadSystemException -> L7f
            int r0 = r6.getRequestedOrientation()     // Catch: android.os.DeadSystemException -> L7f
            if (r0 != r2) goto L7c
            r0 = r1[r8]     // Catch: android.os.DeadSystemException -> L7f
            goto L10
        L7c:
            r0 = r1[r7]     // Catch: android.os.DeadSystemException -> L7f
            goto L10
        L7f:
            X.LFg r0 = X.C53946LFe.LIZJ(r6, r4)
            int r0 = r0.LIZIZ
            goto L10
        L86:
            int r2 = X.MG8.LLIFFJFJJ
            int r0 = X.MG8.LJZ
            int r0 = r0 * r1
            int r2 = r2 - r0
            int r0 = r9.LJLJLLL
            int r2 = r2 - r0
            r0 = r1 ^ 1
            int r1 = r10 - r0
            boolean r0 = r9.LJLJI
            if (r0 == 0) goto Lac
            int r0 = X.MG8.LJZL
        L99:
            int r1 = r1 * r0
            int r2 = r2 - r1
            int r0 = r9.LJLL
            int r2 = r2 - r0
            int r2 = r2 / r10
            X.MG8.LLFFF = r2
            int r0 = X.MG8.LLD
            if (r2 <= r0) goto Laa
        La5:
            X.MG8.LLFII = r8
            X.MG8.LLFZ = r7
            return
        Laa:
            r8 = 0
            goto La5
        Lac:
            int r0 = X.MG8.LJZI
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MG8.M(int):void");
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        int i = LLII;
        if (i != -1) {
            M(i);
        }
    }

    @Override // X.InterfaceC49416JaO
    public final void LJJIJIIJIL(String str, String str2, MixListResponse mixListResponse) {
        List<MixStruct> mixList;
        List<MixStruct> mixList2;
        ArrayList<MixStruct> arrayList;
        if (str == null || str2 == null) {
            return;
        }
        boolean z = true;
        if (o.LJ(this.LJLJL, str) && o.LJ(this.LJLJLJ, str2) && mixListResponse != null && (mixList2 = mixListResponse.getMixList()) != null && !mixList2.isEmpty() && (arrayList = this.LJLJJLL) != null && !arrayList.isEmpty() && mixList2.size() == this.LJLJJLL.size()) {
            int size = mixList2.size();
            for (int i = 0; i < size; i++) {
                if (o.LJ(((MixStruct) ListProtector.get(mixList2, i)).mixId, ((MixStruct) ListProtector.get(this.LJLJJLL, i)).mixId) && o.LJ(((MixStruct) ListProtector.get(mixList2, i)).getMixName(), ((MixStruct) ListProtector.get(this.LJLJJLL, i)).getMixName())) {
                }
            }
            return;
        }
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJJLL.clear();
        if (mixListResponse != null && (mixList = mixListResponse.getMixList()) != null) {
            this.LJLJJLL.addAll(mixList);
        }
        this.LJLLLLLL = mixListResponse;
        this.LJLLI.getState().LJFF();
        ArrayList<MixStruct> arrayList2 = this.LJLJJLL;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z = false;
        }
        if (!z) {
            M(this.LJLJJLL.size());
            this.LJLLILLLL.setVisibility(8);
            this.LJLLI.setVisibility(0);
            ((PowerPageSource) this.LJLZ.getValue()).getOperator().refresh();
            return;
        }
        if (MixFeedService.LJJIJIIJIL().getPushLiveState() && this.LJLILLLLZI && !this.LJLJI) {
            this.LJLLILLLL.setVisibility(0);
            this.LJLLI.setVisibility(8);
        } else {
            C2U8.LIZ(new C9GB());
        }
    }

    public MG8(View view, boolean z, boolean z2, String str, C49398Ja6 c49398Ja6) {
        super(view);
        float LJIIZILJ;
        float LJIIZILJ2;
        int i;
        int LJIILL;
        this.LJLIL = view;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
        this.LJLJJL = c49398Ja6;
        this.LJLJJLL = new ArrayList<>();
        this.LJLJL = "";
        this.LJLJLJ = "";
        if (z2) {
            LJIIZILJ = C32151Nz.LJIIZILJ(8);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(12);
        }
        this.LJLJLLL = O6R.LJJIIZ(LJIIZILJ);
        if (z2) {
            LJIIZILJ2 = C32151Nz.LJIIZILJ(8);
        } else {
            LJIIZILJ2 = C32151Nz.LJIIZILJ(12);
        }
        this.LJLL = O6R.LJJIIZ(LJIIZILJ2);
        View findViewById = view.findViewById(R.id.i04);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.power_list)");
        SYL syl = (SYL) findViewById;
        this.LJLLI = syl;
        View findViewById2 = view.findViewById(R.id.hry);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.play_list_empty_layout)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById2;
        this.LJLLILLLL = constraintLayout;
        View findViewById3 = view.findViewById(R.id.hrv);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.play_list_account_layout)");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.hrx);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.play_list_empty_doc)");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.hru);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.play_list_account_doc)");
        TextView textView2 = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.n6);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.account_ic_close)");
        FrameLayout frameLayout = (FrameLayout) findViewById6;
        this.LJLLJ = frameLayout;
        View findViewById7 = view.findViewById(R.id.e95);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.ic_close)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById7;
        this.LJLLL = frameLayout2;
        View findViewById8 = view.findViewById(R.id.frt);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.line)");
        this.LJLLLL = findViewById8;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 5));
        this.LJLZ = LIZIZ;
        Activity LIZ = FT5.LIZ(view, "view.context");
        if (LIZ != null) {
            i = LIZ.hashCode();
        } else {
            i = -1;
        }
        C9XU.LIZ(i, this);
        syl.LLLF.LJZL(PlayListNameCell.class, PlayListNameAddCell.class);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        syl.setLayoutManager(linearLayoutManager);
        C16880lQ.LJIILJJIL(frameLayout2, new View.OnClickListener() { // from class: X.9GC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MixFeedService.LJJIJIIJIL().LIZJ();
                C2U8.LIZ(new C9GB());
            }
        });
        h0.LJIJI(frameLayout2, new IDaS88S0000000_1(0));
        C16880lQ.LJIILJJIL(frameLayout, new View.OnClickListener() { // from class: X.9GD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MixFeedService.LJJIJIIJIL().LJFF(false);
                C2U8.LIZ(new C9GB());
            }
        });
        C16880lQ.LJIL(constraintLayout, new ACListenerS29S0100000_9(this, 2));
        C16880lQ.LJIL(constraintLayout2, ViewOnClickListenerC53730L6w.LJLIL);
        View findViewById9 = view.findViewById(R.id.n2);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.account_arrow)");
        View findViewById10 = view.findViewById(R.id.cv1);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.empty_arrow)");
        Drawable drawable = view.getContext().getResources().getDrawable(R.drawable.bz5);
        drawable.setAutoMirrored(true);
        ((ImageView) findViewById9).setImageDrawable(drawable);
        ((ImageView) findViewById10).setImageDrawable(drawable);
        syl.LJII(new MGC(this), -1);
        textView2.setMaxWidth(KL2.LJIIJJI(view.getContext()) - LLFF);
        textView.setMaxWidth(KL2.LJIIJJI(view.getContext()) - LLF);
        syl.LJLJLLL((AbstractC72278SYg) LIZIZ.getValue());
        if (C86034Xpe.LIZIZ.forcedPrivateSettingForLikedVideo() && !z) {
            findViewById8.setVisibility(0);
        } else {
            findViewById8.setVisibility(8);
        }
        if (z2) {
            LJIILL = C17N.LJIILL(109.0d);
        } else {
            LJIILL = C17N.LJIILL(88.0d);
        }
        LLD = LJIILL;
    }
}
