package com.ss.android.ugc.aweme.share.core.ui.campaign;

import X.ASN;
import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.C025908h;
import X.C10A;
import X.C113914dX;
import X.C114044dk;
import X.C119364mK;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C25600zU;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C47135Ieh;
import X.C62285OcT;
import X.C62286OcU;
import X.C62287OcV;
import X.C62387Oe7;
import X.C62467OfP;
import X.C62468OfQ;
import X.C76800UCe;
import X.C78857UxB;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.C9U7;
import X.InterfaceC219588ja;
import X.J83;
import X.O6R;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS46S0100000_10;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareCampaignFragment extends Fragment implements ASN, InterfaceC219588ja {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C9U7 LJLIL;
    public String LJLILLLLZI;
    public C62387Oe7 LJLJI;
    public String LJLJJI = "";
    public View LJLJJL;
    public TuxSheet LJLJJLL;
    public HashMap LJLJL;

    public final View _$_findCachedViewById(int i) {
        if (this.LJLJL == null) {
            this.LJLJL = new HashMap();
        }
        View view = (View) this.LJLJL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJLJL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ASN
    public final void a5() {
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        int i;
        Integer num;
        C25600zU LJJL;
        C25600zU LJJL2;
        Integer LJIIIZ;
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        Context context = getContext();
        if (context != null && (LJJL2 = C78857UxB.LJJL(context)) != null && (LJIIIZ = C78857UxB.LJIIIZ(R.attr.fd, LJJL2)) != null) {
            i = LJIIIZ.intValue();
        } else {
            i = 0;
        }
        c2068389v.LIZ = i;
        Context context2 = getContext();
        if (context2 != null && (LJJL = C78857UxB.LJJL(context2)) != null) {
            num = C79045V0n.LJI(R.attr.g5, LJJL);
        } else {
            num = null;
        }
        c2068389v.LJ = num;
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS160S0100000_10(this, 358));
        C9KF c9kf = new C9KF();
        String string = getString(R.string.h1r);
        o.LJIIIIZZ(string, "getString(R.string.holid…e_limitedTimeCard_header)");
        c9kf.LIZJ = string;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZJ = c9kf;
        return c235119Kp;
    }

    @Override // X.ASN
    public final C9U7 Zb() {
        C25600zU LJJL;
        Dialog dialog;
        View findViewById;
        int i;
        C25600zU LJJL2;
        Integer LJI;
        Dialog dialog2;
        Window window;
        Dialog dialog3;
        View findViewById2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (LJJL = C78857UxB.LJJL(mo49getActivity)) == null) {
            return null;
        }
        this.LJLIL = new C9U7(LJJL);
        TuxSheet tuxSheet = this.LJLJJLL;
        if (tuxSheet != null && (dialog3 = tuxSheet.getDialog()) != null && (findViewById2 = dialog3.findViewById(R.id.c8m)) != null) {
            findViewById2.post(new ARunnableS21S0300000_10(findViewById2, LJJL, this, 12));
        }
        TuxSheet tuxSheet2 = this.LJLJJLL;
        if (tuxSheet2 != null && (dialog = tuxSheet2.getDialog()) != null && (findViewById = dialog.findViewById(android.R.id.content)) != null) {
            TuxSheet tuxSheet3 = this.LJLJJLL;
            if (tuxSheet3 != null && (dialog2 = tuxSheet3.getDialog()) != null && (window = dialog2.getWindow()) != null) {
                window.clearFlags(2);
            }
            Context context = getContext();
            if (context != null && (LJJL2 = C78857UxB.LJJL(context)) != null && (LJI = C79045V0n.LJI(R.attr.fx, LJJL2)) != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            findViewById.setBackgroundColor(i);
        }
        return this.LJLIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.LJLJL;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        C62468OfQ.LIZLLL(true);
        super.onAttach(context);
    }

    public final void vl(int i) {
        BaseSharePackage baseSharePackage;
        String str;
        String str2;
        List<String> list;
        String str3;
        List<String> list2;
        String str4;
        String str5;
        SmartImageView targetCoverView;
        int i2;
        Integer LJI;
        BaseSharePackage baseSharePackage2;
        Bundle bundle;
        BaseSharePackage baseSharePackage3;
        Bundle bundle2;
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (LIZ != null) {
            String str7 = LIZ.operationId;
            List<String> list3 = LIZ.operationTemplateList;
            if (list3 == null || (str4 = (String) ListProtector.get(list3, i)) == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            String str8 = this.LJLJJI;
            C62387Oe7 c62387Oe7 = this.LJLJI;
            if (c62387Oe7 == null || (baseSharePackage3 = c62387Oe7.LJIIJ) == null || (bundle2 = baseSharePackage3.extras) == null || (str5 = bundle2.getString("app_language")) == null) {
                str5 = "en";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            YE1.LIZLLL(LIZ2, LIZ.operationTemplateResourcePrefix, str7, "_", str4);
            YE1.LIZLLL(LIZ2, "_", str8, "_", str4);
            String templateUrl = C025908h.LIZIZ(LIZ2, "_", str5, ".png", LIZ2);
            C62387Oe7 c62387Oe72 = this.LJLJI;
            if (c62387Oe72 != null && (baseSharePackage2 = c62387Oe72.LJIIJ) != null && (bundle = baseSharePackage2.extras) != null) {
                bundle.putString("share_template_id", str4);
            }
            C9U7 c9u7 = this.LJLIL;
            if (c9u7 != null) {
                String str9 = this.LJLILLLLZI;
                o.LJIIIZ(templateUrl, "templateUrl");
                ImageView iv_video_cover_left = (ImageView) c9u7.LIZ(R.id.fck);
                o.LJIIIIZZ(iv_video_cover_left, "iv_video_cover_left");
                iv_video_cover_left.setVisibility(8);
                ImageView iv_video_cover_middle = (ImageView) c9u7.LIZ(R.id.fcl);
                o.LJIIIIZZ(iv_video_cover_middle, "iv_video_cover_middle");
                iv_video_cover_middle.setVisibility(8);
                ImageView iv_video_cover_right = (ImageView) c9u7.LIZ(R.id.fcm);
                o.LJIIIIZZ(iv_video_cover_right, "iv_video_cover_right");
                iv_video_cover_right.setVisibility(8);
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            targetCoverView = (SmartImageView) c9u7.LIZ(R.id.fck);
                        } else {
                            targetCoverView = (SmartImageView) c9u7.LIZ(R.id.fcm);
                        }
                    } else {
                        targetCoverView = (SmartImageView) c9u7.LIZ(R.id.fcl);
                    }
                } else {
                    targetCoverView = (SmartImageView) c9u7.LIZ(R.id.fcm);
                }
                o.LJIIIIZZ(targetCoverView, "targetCoverView");
                int i3 = 0;
                targetCoverView.setVisibility(0);
                W5F LJIIIIZZ = W5U.LJIIIIZZ(templateUrl);
                LJIIIIZZ.LJJIIJ = (SmartImageView) c9u7.LIZ(R.id.ezt);
                View iv_card_bg = c9u7.LIZ(R.id.ezt);
                o.LJIIIIZZ(iv_card_bg, "iv_card_bg");
                Context context = iv_card_bg.getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.ew, context)) != null) {
                    i2 = LJI.intValue();
                } else {
                    i2 = 0;
                }
                LJIIIIZZ.LJIIJJI = i2;
                C16880lQ.LLJJJ(LJIIIIZZ);
                if (str9 != null) {
                    W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str9);
                    LJIIIIZZ2.LJJIIJ = targetCoverView;
                    Context context2 = targetCoverView.getContext();
                    o.LJIIIIZZ(context2, "targetCoverView.context");
                    Integer LJI2 = C79045V0n.LJI(R.attr.ew, context2);
                    if (LJI2 != null) {
                        i3 = LJI2.intValue();
                    }
                    LJIIIIZZ2.LJIIJJI = i3;
                    C16880lQ.LLJJJ(LJIIIIZZ2);
                }
            }
        }
        C62387Oe7 c62387Oe73 = this.LJLJI;
        if (c62387Oe73 != null && (baseSharePackage = c62387Oe73.LJIIJ) != null) {
            SharingOperationConfig LIZ3 = C62285OcT.LIZ();
            if (LIZ3 == null || (list2 = LIZ3.operationTemplateList) == null || (str = (String) ListProtector.get(list2, i)) == null) {
                str = "";
            }
            Bundle bundle3 = baseSharePackage.extras;
            SharingOperationConfig LIZ4 = C62285OcT.LIZ();
            if (LIZ4 != null) {
                str2 = LIZ4.operationId;
            } else {
                str2 = null;
            }
            bundle3.putString("share_campaign_id", str2);
            baseSharePackage.extras.putString("share_template_id", str);
            baseSharePackage.extras.putString("share_display_tag_id", this.LJLJJI);
            Bundle bundle4 = baseSharePackage.extras;
            SharingOperationConfig LIZ5 = C62285OcT.LIZ();
            if (LIZ5 != null && (list = LIZ5.operationTemplateList) != null && (str3 = (String) ListProtector.get(list, i)) != null) {
                str6 = str3;
            }
            bundle4.putString("share_copy_id", str6);
            Bundle bundle5 = baseSharePackage.extras;
            if (bundle5 != null) {
                bundle5.putString("share_template_id", str);
            }
            C62467OfP.LIZ(baseSharePackage, str, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C113914dX c113914dX;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("template_resource_prefix")) == null) {
            str = "";
        }
        C62287OcV c62287OcV = new C62287OcV(str);
        c62287OcV.LJLJI = new AqS176S0100000_10(this, 133);
        getContext();
        int i = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        RecyclerView rv_campaign_template = (RecyclerView) _$_findCachedViewById(R.id.j9i);
        o.LJIIIIZZ(rv_campaign_template, "rv_campaign_template");
        rv_campaign_template.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j9i);
        Context context = getContext();
        int i2 = J83.LIZ;
        if (i2 > 0) {
            i = i2;
        } else if (context != null) {
            J83.LIZJ(context);
            int i3 = J83.LIZ;
            if (i3 > 0) {
                i = i3;
            }
        }
        final int LIZ = (C47135Ieh.LIZ(40, i) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(300))) / 2;
        recyclerView.LJII(new AbstractC030309z(LIZ) { // from class: X.4dd
            public final int LJLIL;

            {
                this.LJLIL = LIZ;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                if (C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state", view2) == 0) {
                    if (!C113954db.LIZ()) {
                        rect.left = 0;
                        return;
                    } else {
                        rect.right = 0;
                        return;
                    }
                }
                if (!C113954db.LIZ()) {
                    rect.left = this.LJLIL;
                } else {
                    rect.right = this.LJLIL;
                }
            }
        }, -1);
        RecyclerView rv_campaign_template2 = (RecyclerView) _$_findCachedViewById(R.id.j9i);
        o.LJIIIIZZ(rv_campaign_template2, "rv_campaign_template");
        rv_campaign_template2.setAdapter(c62287OcV);
        C62387Oe7 c62387Oe7 = this.LJLJI;
        if (c62387Oe7 != null && (c113914dX = (C113914dX) _$_findCachedViewById(R.id.b3k)) != null) {
            c113914dX.LJLJL = c62387Oe7;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                C113914dX campaign_channel_bar = (C113914dX) _$_findCachedViewById(R.id.b3k);
                o.LJIIIIZZ(campaign_channel_bar, "campaign_channel_bar");
                C114044dk.LIZ(c62387Oe7, campaign_channel_bar, mo49getActivity, new C62286OcU(this));
            }
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.post(new ARunnableS46S0100000_10(this, 58));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(C119364mK.LIZ(getContext())), R.layout.bm7, viewGroup, false);
        this.LJLJJL = LLLLIILL;
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
