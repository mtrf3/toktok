package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.Jkw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50070Jkw extends FrameLayout {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLIL;
    public String LJLILLLLZI;
    public C49204JSu LJLJI;
    public C50799Jwh LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.isd);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.isd);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42625Go9.LIZJ(this);
    }

    public final String getContainerId() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnVisibleChanged() {
        return this.LJLIL;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastReceiver(C56642Ke broadCastEvent) {
        boolean z;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        if (o.LJ(broadCastEvent.LJLIL.optString("eventName"), "close_search_single_page_view")) {
            String optString = broadCastEvent.LJLIL.optString("reactId");
            if (C33939DTr.LIZ == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.LJLILLLLZI.length() > 0 && o.LJ(optString, this.LJLILLLLZI)) {
                    LIZIZ(null, null);
                }
            } else {
                C49204JSu c49204JSu = this.LJLJI;
                if (c49204JSu != null) {
                    if (o.LJ(c49204JSu.LJLIL, optString)) {
                        LIZIZ(null, null);
                    }
                } else {
                    o.LJIJI("dynamicViewAdapter");
                    throw null;
                }
            }
            ActivityC45651qj LIZ = C48966JJq.LIZ(this);
            if (LIZ != null && C49804Jge.LJJIZ() && (C79234V7u.LJIIIZ(this) instanceof SearchJediMixFeedFragment)) {
                ((SearchContainerHeaderVM) ViewModelProviders.of(LIZ).get(SearchContainerHeaderVM.class)).iv0();
            }
        }
    }

    public final void setContainerId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setOnVisibleChanged(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50070Jkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = "";
    }

    public final void LIZIZ(DynamicPatch dynamicPatch, java.util.Map<String, String> map) {
        LifecycleOwner lifecycleOwner = null;
        if (dynamicPatch == null) {
            if (C33939DTr.LIZ == 1) {
                removeAllViews();
                this.LJLJJI = null;
            } else if (LIZ() != null) {
                C49204JSu c49204JSu = this.LJLJI;
                if (c49204JSu != null) {
                    c49204JSu.LJLILLLLZI = null;
                    c49204JSu.LJLJI = null;
                    c49204JSu.notifyDataSetChanged();
                } else {
                    o.LJIJI("dynamicViewAdapter");
                    throw null;
                }
            }
            setVisibility(8);
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
            C42625Go9.LIZJ(this);
            return;
        }
        if (C33939DTr.LIZ == 1) {
            if (this.LJLJJI == null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C50799Jwh c50799Jwh = new C50799Jwh(context, lifecycleOwner, 14);
                this.LJLJJI = c50799Jwh;
                c50799Jwh.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), this);
            }
            C50799Jwh c50799Jwh2 = this.LJLJJI;
            if (c50799Jwh2 != null) {
                C50068Jku.LIZIZ(c50799Jwh2, dynamicPatch, map, false, true, 48);
            }
            C50799Jwh c50799Jwh3 = this.LJLJJI;
            if (c50799Jwh3 != null) {
                c50799Jwh3.LIZJ = new C50071Jkx(this);
            }
        } else {
            if (LIZ() == null) {
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cfn, this, true);
                RecyclerView recyclerView = (RecyclerView) LIZ();
                getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                this.LJLJI = new C49204JSu();
                RecyclerView recyclerView2 = (RecyclerView) LIZ();
                C49204JSu c49204JSu2 = this.LJLJI;
                if (c49204JSu2 != null) {
                    recyclerView2.setAdapter(c49204JSu2);
                } else {
                    o.LJIJI("dynamicViewAdapter");
                    throw null;
                }
            }
            C49204JSu c49204JSu3 = this.LJLJI;
            if (c49204JSu3 != null) {
                c49204JSu3.LJLILLLLZI = dynamicPatch;
                c49204JSu3.LJLJI = map;
                c49204JSu3.notifyDataSetChanged();
            } else {
                o.LJIJI("dynamicViewAdapter");
                throw null;
            }
        }
        setVisibility(0);
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2 = this.LJLIL;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(Boolean.TRUE);
        }
        C42625Go9.LIZIZ(this);
    }
}
