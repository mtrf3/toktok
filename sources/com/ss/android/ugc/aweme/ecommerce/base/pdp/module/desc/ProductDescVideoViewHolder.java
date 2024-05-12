package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc;

import X.ActivityC45651qj;
import X.C17N;
import X.C221108m2;
import X.C26338AVi;
import X.C27162AlK;
import X.C27202Aly;
import X.C27204Am0;
import X.C27205Am1;
import X.C27599AsN;
import X.C27600AsO;
import X.C27601AsP;
import X.C27606AsU;
import X.C27740Aue;
import X.C29S;
import X.C45804HyK;
import X.C46580IPw;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70759Rpr;
import X.C70920RsS;
import X.C72545SdZ;
import X.C73043Slb;
import X.C73062Slu;
import X.C73156SnQ;
import X.C73340SqO;
import X.C74291TDr;
import X.C78473Uqz;
import X.C78565UsT;
import X.C78939UyV;
import X.C78946Uyc;
import X.IWF;
import X.InterfaceC27598AsM;
import X.InterfaceC73068Sm0;
import X.TBT;
import X.W5F;
import Y.ARunnableS23S0200000_4;
import android.R;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescVideoViewHolder extends AbsBrickFullSpanVH {
    public final Fragment LJLILLLLZI;
    public final C46580IPw LJLJI;
    public final C62822Ol8 LJLJJI;
    public Aweme LJLJJL;
    public final C73062Slu LJLJJLL;
    public boolean LJLJL;
    public final ProductDescVideoViewHolder$observer$1 LJLJLJ;
    public final C27600AsO LJLJLLL;
    public final Map<Integer, View> LJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AsQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new AqS186S0100000_4(this, 86));
        this.LJLILLLLZI.getLifecycle().addObserver(this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI.getLifecycle().removeObserver(this.LJLJLJ);
    }

    public static boolean M(C73062Slu view) {
        o.LJIIIZ(view, "view");
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        int i = (rect.right - rect.left) * (rect.bottom - rect.top);
        Rect LIZLLL = C27740Aue.LIZLLL(view);
        if ((LIZLLL.height() / 2.0f) + LIZLLL.top < C27162AlK.LIZIZ / 2.0f) {
            i -= C17N.LJIILL(44.0d) * LIZLLL.width();
        }
        if (i >= (view.getMeasuredWidth() * view.getMeasuredHeight()) / 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBind(C27599AsN item) {
        Video video;
        DialogFragment dialogFragment;
        Window window;
        ViewGroup viewGroup;
        C74291TDr c74291TDr;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        this.LJLJJL = item.LJLIL.LIZIZ();
        IProductDescStyle I50 = ((InterfaceC27598AsM) C73340SqO.LJIILJJIL(getViewModel(), InterfaceC27598AsM.class)).I50();
        View view = this.itemView;
        if ((view instanceof C74291TDr) && (c74291TDr = (C74291TDr) view) != null) {
            c74291TDr.setRadius(I50.getVideoRadius());
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26338AVi.LJI(itemView, Integer.valueOf((int) I50.getVideoDescMargin()), null, Integer.valueOf((int) I50.getVideoDescMargin()), Integer.valueOf(I50.getVideoMarginBottom()), false, 18);
        Aweme aweme = this.LJLJJL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C46580IPw c46580IPw = this.LJLJI;
            int LIZLLL = item.LJLIL.LIZLLL();
            c46580IPw.LJ = video;
            c46580IPw.LJFF = LIZLLL;
            C46580IPw c46580IPw2 = this.LJLJI;
            Aweme aweme2 = this.LJLJJL;
            IWF iwf = c46580IPw2.LJII;
            if (iwf != null) {
                iwf.LJJIZ(aweme2, null);
            }
            new C27606AsU();
            C27606AsU c27606AsU = new C27606AsU();
            c27606AsU.LIZ = this.LJLJI;
            c27606AsU.LIZLLL = new C73043Slb(video.getWidth(), video.getHeight());
            c27606AsU.LJ = Integer.valueOf(video.getVideoLength());
            c27606AsU.LJI = this.LJLJLLL;
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity instanceof PdpActivity) {
                C29S c29s = (C29S) mo49getActivity;
                c27606AsU.LIZJ = c29s.getWindow();
                c27606AsU.LIZIZ = (ViewGroup) c29s.findViewById(R.id.content);
            } else if (this.LJLILLLLZI.getParentFragment() instanceof DialogFragment) {
                Fragment parentFragment = this.LJLILLLLZI.getParentFragment();
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
                        viewGroup = (ViewGroup) dialog2.findViewById(R.id.content);
                    } else {
                        viewGroup = null;
                    }
                    c27606AsU.LIZIZ = viewGroup;
                }
            }
            W5F LIZLLL2 = C70759Rpr.LIZLLL(C78939UyV.LJ(video.getCover()));
            LIZLLL2.LIZJ = this.itemView.getContext();
            LIZLLL2.LJIJI = Bitmap.Config.ARGB_8888;
            LIZLLL2.LJIIIZ(new C27601AsP(c27606AsU, this));
            C73062Slu c73062Slu = this.LJLJJLL;
            if (c73062Slu != null) {
                c73062Slu.setParams(c27606AsU);
            }
        }
        if (item.LJLILLLLZI) {
            C45804HyK.LJJLL(this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nav));
            ((TextView) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nay)).setText(this.itemView.getContext().getString(I50.getViewMoreText()));
            ((TuxTextView) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nay)).setTextColorRes(I50.getViewMoreTextColorRes());
            ((TuxIconView) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nax)).setTintColorRes(I50.getViewMoreIconColorRes());
            if (!this.LJLJL) {
                this.LJLJL = true;
                View findViewById = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nav);
                o.LJIIIIZZ(findViewById, "itemView.view_more");
                C78946Uyc.LJJIIJZLJL(findViewById, new C70920RsS(), C27205Am1.LJLIL, C27204Am0.LJLIL);
            }
            View findViewById2 = this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nav);
            o.LJIIIIZZ(findViewById2, "itemView.view_more");
            C78565UsT.LJJIZ(findViewById2, null, new C27202Aly(this, null), 3);
            return;
        }
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(com.zhiliaoapp.musically.R.id.nav));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescVideoViewHolder$observer$1] */
    public ProductDescVideoViewHolder(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", com.zhiliaoapp.musically.R.layout.a37, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLL = new LinkedHashMap();
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 198));
        C73062Slu c73062Slu = (C73062Slu) this.itemView.findViewById(com.zhiliaoapp.musically.R.id.lv2);
        o.LJIIIIZZ(c73062Slu, "this");
        this.LJLJI = new C46580IPw(c73062Slu);
        this.LJLJJLL = c73062Slu;
        this.LJLJLJ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescVideoViewHolder$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                    return;
                }
                if (event == Lifecycle.Event.ON_PAUSE) {
                    onPause();
                } else if (event == Lifecycle.Event.ON_STOP) {
                    onStop();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                String str;
                Aweme aweme = ProductDescVideoViewHolder.this.LJLJJL;
                if (aweme != null && aweme.getVideo() != null) {
                    ProductDescVideoViewHolder productDescVideoViewHolder = ProductDescVideoViewHolder.this;
                    C70414RkI c70414RkI = productDescVideoViewHolder.getViewModel().LLFII;
                    if (c70414RkI != null) {
                        Aweme aweme2 = productDescVideoViewHolder.LJLJJL;
                        if (aweme2 != null) {
                            str = aweme2.getAid();
                        } else {
                            str = null;
                        }
                        c70414RkI.LJJJJZI((int) productDescVideoViewHolder.LJLJI.LJIILJJIL, str, "product_description");
                    }
                }
                C73062Slu c73062Slu2 = ProductDescVideoViewHolder.this.LJLJJLL;
                if (c73062Slu2 != null) {
                    c73062Slu2.LJFF(true);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                ProductDescVideoViewHolder productDescVideoViewHolder = ProductDescVideoViewHolder.this;
                C73062Slu c73062Slu2 = productDescVideoViewHolder.LJLJJLL;
                if (c73062Slu2 != null) {
                    c73062Slu2.post(new ARunnableS23S0200000_4(productDescVideoViewHolder, c73062Slu2, 4));
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                InterfaceC73068Sm0 interfaceC73068Sm0;
                C73062Slu c73062Slu2 = ProductDescVideoViewHolder.this.LJLJJLL;
                if (c73062Slu2 != null && (interfaceC73068Sm0 = c73062Slu2.LJLJJLL) != null) {
                    interfaceC73068Sm0.stop();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                LiveOuterService.LJJJLL().LJJJIL();
                C78473Uqz.LIZIZ(false);
                C73062Slu c73062Slu2 = ProductDescVideoViewHolder.this.LJLJJLL;
                if (c73062Slu2 != null) {
                    c73062Slu2.LJII();
                }
            }
        };
        this.LJLJLLL = new C27600AsO(this);
    }
}
