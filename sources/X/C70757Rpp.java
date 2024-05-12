package X;

import Y.ACListenerS28S0201000_12;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Activity;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70757Rpp extends AbstractC29229BdZ {
    public final C80769Vmv LJLJJLL;
    public final InterfaceC70286RiE LJLJL;
    public final List<HeaderItem> LJLJLJ;
    public final List<ProductBannerLabel> LJLJLLL;
    public boolean LJLL;
    public final java.util.Map<String, C70763Rpv> LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLJ).size();
    }

    public final void LJJIIJZLJL(int i) {
        String str;
        C46580IPw c46580IPw;
        IWF iwf;
        C70763Rpv c70763Rpv;
        C73062Slu c73062Slu;
        Video video;
        HeaderItem headerItem = (HeaderItem) ORZ.LJLLLLLL(i, this.LJLJLJ);
        if (headerItem == null || (video = headerItem.video) == null || (str = video.id) == null) {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C70763Rpv c70763Rpv2 = (C70763Rpv) ((LinkedHashMap) this.LJLLI).get(LIZIZ);
        if (c70763Rpv2 != null && (c46580IPw = c70763Rpv2.LIZJ) != null && (iwf = c46580IPw.LJII) != null && iwf.isPlaying() && (c70763Rpv = (C70763Rpv) ((LinkedHashMap) this.LJLLI).get(LIZIZ)) != null && (c73062Slu = c70763Rpv.LJ) != null) {
            c73062Slu.LJII();
        }
    }

    public C70757Rpp(C80766Vms c80766Vms, InterfaceC70286RiE interfaceC70286RiE) {
        super(c80766Vms.getContext(), C16880lQ.LLZIL(c80766Vms.getContext()), 1);
        this.LJLJJLL = c80766Vms;
        this.LJLJL = interfaceC70286RiE;
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new ArrayList();
        this.LJLL = true;
        this.LJLLI = new LinkedHashMap();
    }

    @Override // X.AbstractC29229BdZ, androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return o.LJ(view, obj);
    }

    @Override // X.AbstractC29229BdZ
    public final View LJJIII(int i, View view, ViewGroup parent) {
        Integer num;
        String str;
        Video video;
        ActivityC45651qj activityC45651qj;
        Fragment fragment;
        DialogFragment dialogFragment;
        Window window;
        ViewGroup viewGroup;
        Video video2;
        o.LJIIIZ(parent, "parent");
        HeaderItem headerItem = (HeaderItem) ORZ.LJLLLLLL(i, this.LJLJLJ);
        ViewGroup viewGroup2 = null;
        if (headerItem != null) {
            num = headerItem.type;
        } else {
            num = null;
        }
        if (num != null && headerItem.type.intValue() == 2) {
            HeaderItem headerItem2 = (HeaderItem) ORZ.LJLLLLLL(i, this.LJLJLJ);
            if (headerItem2 == null || (video2 = headerItem2.video) == null || (str = video2.id) == null) {
                str = "";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append(' ');
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C70763Rpv c70763Rpv = (C70763Rpv) ((LinkedHashMap) this.LJLLI).get(LIZIZ);
            if (c70763Rpv != null) {
                ViewParent parent2 = c70763Rpv.LIZLLL.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    C16880lQ.LJLLL(c70763Rpv.LIZLLL, viewGroup);
                }
                return c70763Rpv.LIZLLL;
            }
            Context context = this.LJLJJLL.getContext();
            o.LJIIIIZZ(context, "viewPager.context");
            C70763Rpv c70763Rpv2 = new C70763Rpv(context);
            HeaderItem headerItem3 = (HeaderItem) ORZ.LJLLLLLL(i, this.LJLJLJ);
            if (headerItem3 != null && (video = headerItem3.video) != null) {
                Aweme LIZIZ2 = video.LIZIZ();
                com.ss.android.ugc.aweme.feed.model.Video video3 = LIZIZ2.getVideo();
                if (video3 != null) {
                    C46580IPw c46580IPw = c70763Rpv2.LIZJ;
                    int LIZLLL = video.LIZLLL();
                    c46580IPw.LJ = video3;
                    c46580IPw.LJFF = LIZLLL;
                    IWF iwf = c70763Rpv2.LIZJ.LJII;
                    if (iwf != null) {
                        iwf.LJJIZ(LIZIZ2, null);
                    }
                    new C27606AsU();
                    C27606AsU c27606AsU = new C27606AsU();
                    c27606AsU.LIZ = c70763Rpv2.LIZJ;
                    c27606AsU.LIZLLL = new C73043Slb(video3.getWidth(), video3.getHeight());
                    c27606AsU.LJ = Integer.valueOf(video3.getVideoLength());
                    c27606AsU.LJI = c70763Rpv2.LJIIIIZZ;
                    Fragment LJIIIZ = C79234V7u.LJIIIZ(parent);
                    if (LJIIIZ != null) {
                        activityC45651qj = LJIIIZ.mo49getActivity();
                    } else {
                        activityC45651qj = null;
                    }
                    if (activityC45651qj instanceof PdpV2Activity) {
                        C29S c29s = (C29S) activityC45651qj;
                        c27606AsU.LIZJ = c29s.getWindow();
                        c27606AsU.LIZIZ = (ViewGroup) c29s.findViewById(R.id.content);
                    } else {
                        if (LJIIIZ != null) {
                            fragment = LJIIIZ.getParentFragment();
                        } else {
                            fragment = null;
                        }
                        if (fragment instanceof DialogFragment) {
                            Fragment parentFragment = LJIIIZ.getParentFragment();
                            if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null) {
                                Dialog dialog = dialogFragment.getDialog();
                                if (dialog != null) {
                                    window = dialog.getWindow();
                                } else {
                                    window = null;
                                }
                                c27606AsU.LIZJ = window;
                                Dialog dialog2 = dialogFragment.getDialog();
                                if (dialog2 != null) {
                                    viewGroup2 = (ViewGroup) dialog2.findViewById(R.id.content);
                                }
                                c27606AsU.LIZIZ = viewGroup2;
                            }
                        }
                    }
                    W5F LJII = W5U.LJII(C78939UyV.LJ(video3.getCover()));
                    LJII.LIZJ = parent.getContext();
                    LJII.LJIJI = Bitmap.Config.ARGB_8888;
                    LJII.LJIIIZ(new C70771Rq3(c27606AsU, c70763Rpv2));
                    if (video3.getVideoLength() <= 0) {
                        c70763Rpv2.LIZJ.LIZLLL((IPR) c70763Rpv2.LJII.getValue());
                    }
                    c70763Rpv2.LJ.setParams(c27606AsU);
                    c70763Rpv2.LIZIZ = c27606AsU;
                }
                c70763Rpv2.LIZ = LIZIZ2;
            }
            this.LJLLI.put(LIZIZ, c70763Rpv2);
            return c70763Rpv2.LIZLLL;
        }
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        View LIZ2 = C27532ArI.LIZ(com.zhiliaoapp.musically.R.layout.a2v, context2, parent, false);
        int i2 = -1;
        LIZ2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        SmartImageView smartImageView = (SmartImageView) LIZ2.findViewById(com.zhiliaoapp.musically.R.id.egd);
        AM1 am1 = (AM1) LIZ2.findViewById(com.zhiliaoapp.musically.R.id.i5q);
        Iterator it = ((ArrayList) this.LJLJLJ).iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Integer num2 = ((HeaderItem) it.next()).type;
            if (num2 == null || num2.intValue() != 1) {
                i3++;
            } else {
                i2 = i3;
                break;
            }
        }
        if (i == i2) {
            if (am1 != null) {
                am1.setLabels$ecommerce_transaction_release(this.LJLJLLL);
            }
        } else if (am1 != null) {
            am1.setLabels$ecommerce_transaction_release(null);
        }
        Image image = ((HeaderItem) ListProtector.get(this.LJLJLJ, i)).image;
        if (image != null) {
            W5F LIZLLL2 = C70759Rpr.LIZLLL(image);
            LIZLLL2.LIZIZ("CommerceHeadVH");
            LIZLLL2.LJIJJ = EnumC72807Shn.FIT_CENTER;
            LIZLLL2.LJJIIJ = smartImageView;
            C48841JEv.LIZ(C78613UtF.LIZJ);
            C16880lQ.LLJJJ(LIZLLL2);
        }
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS28S0201000_12(i, this, parent, 3));
        return LIZ2;
    }
}
