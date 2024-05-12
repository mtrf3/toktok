package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class NI8 implements NSE {
    public final View LIZ;
    public final C91Z LIZIZ;
    public Ad4adModel LIZJ;
    public Aweme LIZLLL;
    public C59948Nfs LJ;
    public ViewGroup LJFF;
    public FrameLayout LJI;
    public SY4 LJII;
    public SY4 LJIIIIZZ;
    public final String LJIIIZ;
    public Handler LJIIJ;
    public ARunnableS46S0100000_10 LJIIJJI;
    public final C62822Ol8 LJIIL;

    @Override // X.NSE
    public final void LIZ(Aweme aweme) {
        Handler handler;
        if (C59111NHv.LIZLLL(aweme) && !C59111NHv.LJ(aweme)) {
            C42625Go9.LIZJ(this);
            if (C59406NTe.LJIILL()) {
                ARunnableS46S0100000_10 aRunnableS46S0100000_10 = this.LJIIJJI;
                if (aRunnableS46S0100000_10 != null && (handler = this.LJIIJ) != null) {
                    handler.removeCallbacks(aRunnableS46S0100000_10);
                }
                C59411NTj.LIZIZ.LJJIII();
            }
        }
    }

    @Override // X.NSE
    public final void LIZIZ(Aweme aweme) {
        if (C59111NHv.LIZLLL(aweme) && !C59111NHv.LJ(aweme)) {
            C42625Go9.LIZIZ(this);
            if (C59406NTe.LJIILL()) {
                try {
                    Handler handler = new Handler(C16880lQ.LLJJJJ());
                    this.LJIIJ = handler;
                    ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 208);
                    this.LJIIJJI = aRunnableS46S0100000_10;
                    handler.postDelayed(aRunnableS46S0100000_10, 500L);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // X.NSE
    public final void LIZLLL(Aweme aweme) {
        String str;
        Ad4adModel ad4adModel;
        FrameLayout frameLayout;
        SY4 sy4;
        String promotionLabel;
        C59948Nfs c59948Nfs;
        ViewGroup viewGroup;
        C59948Nfs c59948Nfs2 = this.LJ;
        if (c59948Nfs2 != null) {
            c59948Nfs2.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.LJFF;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.LJI;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        String str2 = null;
        this.LIZLLL = null;
        this.LIZJ = null;
        if (C59111NHv.LIZLLL(aweme)) {
            this.LIZLLL = aweme;
            this.LIZJ = C59111NHv.LIZJ(aweme);
            if (this.LJ == null) {
                if (C226128u8.LIZ()) {
                    C91Z c91z = this.LIZIZ;
                    if (c91z instanceof C2MA) {
                        View V8 = ((C2MA) c91z).V8("ad4ad_label", true);
                        if (V8 instanceof ViewGroup) {
                            viewGroup = (ViewGroup) V8;
                        } else {
                            viewGroup = null;
                        }
                        this.LJFF = viewGroup;
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ.getContext()), R.layout.a_u, this.LJFF, false);
                        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.rich.ui.RichTagView");
                        C59948Nfs c59948Nfs3 = (C59948Nfs) LLLLIILL;
                        this.LJ = c59948Nfs3;
                        ViewGroup viewGroup3 = this.LJFF;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(c59948Nfs3);
                        }
                        ViewGroup viewGroup4 = this.LJFF;
                        if (viewGroup4 != null) {
                            viewGroup4.setVisibility(8);
                        }
                    } else {
                        "invalid input component should be implemented from IFeedViewHolder".toString();
                        throw new IllegalStateException("invalid input component should be implemented from IFeedViewHolder");
                    }
                } else {
                    this.LJ = (C59948Nfs) this.LIZ.findViewById(R.id.pw);
                }
            }
            if (this.LJI == null) {
                FrameLayout frameLayout3 = (FrameLayout) this.LJIIL.getValue();
                if (frameLayout3 != null) {
                    if (frameLayout3.findViewById(R.id.atv) == null) {
                        C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout3.getContext()), R.layout.bht, frameLayout3, true);
                    }
                } else {
                    frameLayout3 = null;
                }
                this.LJI = frameLayout3;
            }
            Ad4adModel ad4adModel2 = this.LIZJ;
            if (ad4adModel2 != null && (promotionLabel = ad4adModel2.getPromotionLabel()) != null && (c59948Nfs = this.LJ) != null) {
                C59946Nfq LIZ = NDH.LIZ();
                LIZ.LJIIJ(promotionLabel);
                LIZ.LJIIL(72);
                LIZ.LIZ(C78609UtB.LJJJ(R.attr.dj, this.LIZ.getContext()));
                LIZ.LJIIJJI(C78609UtB.LJJJ(R.attr.do, this.LIZ.getContext()));
                LIZ.LIZLLL(C63081OpJ.LJIJJLI(this.LIZ.getContext(), 22.0f));
                LIZ.LIZIZ(C63081OpJ.LJIJJLI(this.LIZ.getContext(), 2.0f));
                C59947Nfr c59947Nfr = LIZ.LIZ;
                if (c59947Nfr != null) {
                    c59948Nfs.LIZ(c59947Nfr);
                    c59948Nfs.setVisibility(0);
                    ViewGroup viewGroup5 = this.LJFF;
                    if (viewGroup5 != null) {
                        viewGroup5.setVisibility(0);
                    }
                }
            }
            Ad4adModel ad4adModel3 = this.LIZJ;
            if (ad4adModel3 != null) {
                str = ad4adModel3.getNotInterestedButtonText();
            } else {
                str = null;
            }
            Ad4adModel ad4adModel4 = this.LIZJ;
            if (ad4adModel4 != null) {
                str2 = ad4adModel4.getPromoteButtonText();
            }
            if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && (ad4adModel = this.LIZJ) != null && !ad4adModel.getBanButton() && (frameLayout = this.LJI) != null) {
                if (!TextUtils.isEmpty(str)) {
                    SY4 sy42 = (SY4) frameLayout.findViewById(R.id.atv);
                    this.LJII = sy42;
                    if (sy42 != null) {
                        sy42.setText(str);
                    }
                    SY4 sy43 = this.LJII;
                    if (sy43 != null) {
                        C16880lQ.LJJIZ(sy43, new ACListenerS30S0100000_10(this, 195));
                    }
                    SY4 sy44 = this.LJII;
                    if (sy44 != null) {
                        sy44.setVisibility(0);
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    SY4 sy45 = (SY4) frameLayout.findViewById(R.id.au3);
                    this.LJIIIIZZ = sy45;
                    if (sy45 != null) {
                        sy45.setText(str2);
                    }
                    SY4 sy46 = this.LJIIIIZZ;
                    if (sy46 != null) {
                        C16880lQ.LJJIZ(sy46, new ACListenerS30S0100000_10(this, 196));
                    }
                    SY4 sy47 = this.LJIIIIZZ;
                    if (sy47 != null) {
                        sy47.setVisibility(0);
                    }
                    if (TextUtils.isEmpty(str2) && (sy4 = this.LJIIIIZZ) != null) {
                        C26338AVi.LJI(sy4, AnonymousClass391.LIZJ(0), null, null, null, false, 30);
                    }
                }
                frameLayout.setVisibility(0);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke broadCastEvent) {
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        if (o.LJ(broadCastEvent.LJLIL.optString("eventName"), "_p_order_success_notification")) {
            FrameLayout frameLayout = this.LJI;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            Ad4adModel ad4adModel = this.LIZJ;
            if (ad4adModel == null) {
                return;
            }
            ad4adModel.setBanButton(true);
        }
    }

    public NI8(View rootView, VideoBaseCell component, String eventType) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(component, "component");
        o.LJIIIZ(eventType, "eventType");
        this.LIZ = rootView;
        this.LIZIZ = component;
        this.LJIIIZ = eventType;
        this.LJIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 601));
    }
}
