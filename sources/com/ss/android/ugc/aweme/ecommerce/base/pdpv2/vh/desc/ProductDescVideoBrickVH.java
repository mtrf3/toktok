package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C27606AsU;
import X.C27659AtL;
import X.C27661AtN;
import X.C27662AtO;
import X.C27663AtP;
import X.C29S;
import X.C45804HyK;
import X.C46580IPw;
import X.C62822Ol8;
import X.C73043Slb;
import X.C73062Slu;
import X.C78565UsT;
import X.C78939UyV;
import X.IWF;
import X.W5F;
import X.W5U;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Activity;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescVideoBrickVO;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescVideoBrickVH extends BaseBrickVH<ProductDescVideoBrickVO> {
    public C46580IPw LJLJLLL;
    public Aweme LJLL;
    public C73062Slu LJLLI;
    public C27606AsU LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C27663AtP LJLLLLLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final boolean Q() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void U() {
        C73062Slu c73062Slu = this.LJLLI;
        if (c73062Slu != null) {
            c73062Slu.LJFF(true);
        }
        C46580IPw c46580IPw = this.LJLJLLL;
        if (c46580IPw != null) {
            Object uiPlayListener = this.LJLLLL.getValue();
            o.LJIIIZ(uiPlayListener, "uiPlayListener");
            if (c46580IPw.LJFF().contains(uiPlayListener)) {
                c46580IPw.LJFF().remove(uiPlayListener);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void V() {
        C73062Slu c73062Slu = (C73062Slu) this.itemView.findViewById(R.id.lv2);
        o.LJIIIIZZ(c73062Slu, "this");
        this.LJLJLLL = new C46580IPw(c73062Slu);
        this.LJLLI = c73062Slu;
    }

    public ProductDescVideoBrickVH() {
        super(R.layout.a37);
        this.LJLLL = true;
        this.LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 291));
        this.LJLLLLLL = new C27663AtP(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        IWF iwf;
        C73062Slu c73062Slu;
        super.onViewDetachedFromWindow();
        C46580IPw c46580IPw = this.LJLJLLL;
        if (c46580IPw != null && (iwf = c46580IPw.LJII) != null && iwf.isPlaying() && (c73062Slu = this.LJLLI) != null) {
            c73062Slu.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(ProductDescVideoBrickVO productDescVideoBrickVO) {
        ActivityC45651qj activityC45651qj;
        Fragment fragment;
        Fragment fragment2;
        DialogFragment dialogFragment;
        ViewGroup viewGroup;
        Window window;
        C46580IPw c46580IPw;
        ProductDescVideoBrickVO item = productDescVideoBrickVO;
        o.LJIIIZ(item, "item");
        Video video = item.video;
        if (video != null) {
            Aweme LIZIZ = video.LIZIZ();
            this.LJLL = LIZIZ;
            com.ss.android.ugc.aweme.feed.model.Video video2 = LIZIZ.getVideo();
            if (video2 != null) {
                C46580IPw c46580IPw2 = this.LJLJLLL;
                if (c46580IPw2 != null) {
                    int LIZLLL = video.LIZLLL();
                    c46580IPw2.LJ = video2;
                    c46580IPw2.LJFF = LIZLLL;
                }
                C46580IPw c46580IPw3 = this.LJLJLLL;
                if (c46580IPw3 != null) {
                    Aweme aweme = this.LJLL;
                    IWF iwf = c46580IPw3.LJII;
                    if (iwf != null) {
                        iwf.LJJIZ(aweme, null);
                    }
                }
                new C27606AsU();
                C27606AsU c27606AsU = new C27606AsU();
                c27606AsU.LIZ = this.LJLJLLL;
                c27606AsU.LIZLLL = new C73043Slb(video2.getWidth(), video2.getHeight());
                c27606AsU.LJ = Integer.valueOf(video2.getVideoLength());
                c27606AsU.LJI = this.LJLLLLLL;
                this.LJLLILLLL = c27606AsU;
                Fragment fragment3 = getFragment();
                if (fragment3 != null) {
                    activityC45651qj = fragment3.mo49getActivity();
                } else {
                    activityC45651qj = null;
                }
                if (activityC45651qj instanceof PdpV2Activity) {
                    C27606AsU c27606AsU2 = this.LJLLILLLL;
                    if (c27606AsU2 != null) {
                        c27606AsU2.LIZJ = activityC45651qj.getWindow();
                    }
                    C27606AsU c27606AsU3 = this.LJLLILLLL;
                    if (c27606AsU3 != null) {
                        c27606AsU3.LIZIZ = (ViewGroup) ((C29S) activityC45651qj).findViewById(android.R.id.content);
                    }
                } else {
                    Fragment fragment4 = getFragment();
                    if (fragment4 != null) {
                        fragment = fragment4.getParentFragment();
                    } else {
                        fragment = null;
                    }
                    if (fragment instanceof DialogFragment) {
                        Fragment fragment5 = getFragment();
                        if (fragment5 != null) {
                            fragment2 = fragment5.getParentFragment();
                        } else {
                            fragment2 = null;
                        }
                        if ((fragment2 instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragment2) != null) {
                            C27606AsU c27606AsU4 = this.LJLLILLLL;
                            if (c27606AsU4 != null) {
                                Dialog dialog = dialogFragment.getDialog();
                                if (dialog != null) {
                                    window = dialog.getWindow();
                                } else {
                                    window = null;
                                }
                                c27606AsU4.LIZJ = window;
                            }
                            C27606AsU c27606AsU5 = this.LJLLILLLL;
                            if (c27606AsU5 != null) {
                                Dialog dialog2 = dialogFragment.getDialog();
                                if (dialog2 != null) {
                                    viewGroup = (ViewGroup) dialog2.findViewById(android.R.id.content);
                                } else {
                                    viewGroup = null;
                                }
                                c27606AsU5.LIZIZ = viewGroup;
                            }
                        }
                    }
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(video2.getCover()));
                LJII.LIZJ = this.itemView.getContext();
                LJII.LJIJI = Bitmap.Config.ARGB_8888;
                LJII.LJIIIZ(new C27661AtN(this));
                if (video2.getVideoLength() <= 0 && (c46580IPw = this.LJLJLLL) != null) {
                    c46580IPw.LIZLLL((C27662AtO) this.LJLLLL.getValue());
                }
                C73062Slu c73062Slu = this.LJLLI;
                if (c73062Slu != null) {
                    c73062Slu.setParams(this.LJLLILLLL);
                }
            }
        }
        if (item.needShowViewMore) {
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.nav));
            View findViewById = this.itemView.findViewById(R.id.nav);
            o.LJIIIIZZ(findViewById, "itemView.view_more");
            C78565UsT.LJJIZ(findViewById, null, new C27659AtL(this, null), 3);
            return;
        }
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.nav));
    }
}
