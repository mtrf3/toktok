package com.bytedance.android.livesdk.moderator;

import X.ActivityC45651qj;
import X.B83;
import X.B9K;
import X.BEM;
import X.BFC;
import X.C025908h;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15G;
import X.C16880lQ;
import X.C18950ol;
import X.C23010vJ;
import X.C238749Yo;
import X.C28383BBz;
import X.C28442BEg;
import X.C28443BEh;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C47121t6;
import X.C51029K0z;
import X.C61878OQg;
import X.C73943T0h;
import X.C76800UCe;
import X.C81185Vtd;
import X.C90903hW;
import X.CN1;
import X.ORZ;
import Y.ACListenerS25S0100000_5;
import Y.AUListenerS94S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class AddModeratorFragment extends BaseFragment implements C15G {
    public C238749Yo LJLIL;
    public MeasureLinearLayout LJLILLLLZI;
    public View LJLJI;
    public String LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C28383BBz LJLJJL = new C28383BBz(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public final void initData() {
        ?? r4;
        List list;
        List<C28443BEh> LJIIJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIJ();
        if (LJIIJ == null) {
            LJIIJ = C61878OQg.INSTANCE;
        }
        if (!(LJIIJ instanceof Collection) || !LJIIJ.isEmpty()) {
            Iterator<C28443BEh> it = LJIIJ.iterator();
            while (it.hasNext()) {
                Long l = it.next().LIZ;
                long vl = vl();
                if (l == null || l.longValue() != vl) {
                    DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                    if (LJIILIIL != null && (list = (List) LJIILIIL.kv0(ModeratorListChannel.class)) != null) {
                        r4 = new ArrayList(C32I.LJJL(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r4.add(Long.valueOf(((BFC) it2.next()).LIZ));
                        }
                    } else {
                        r4 = C61878OQg.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
                    for (C28443BEh c28443BEh : LJIIJ) {
                        arrayList.add(C28442BEg.LIZ(c28443BEh, ORZ.LJLJJI(c28443BEh.LIZ, r4)));
                    }
                    C238749Yo c238749Yo = new C238749Yo(vl(), C51029K0z.LJIILIIL(this), "friend_panel", true, o.LJ(this.LJLJJI, "multi_guest_panel"));
                    c238749Yo.setData(arrayList);
                    c238749Yo.LJLJLJ = new AqS171S0100000_5(this, 707);
                    this.LJLIL = c238749Yo;
                    register(C73943T0h.LIZ().LJ(BEM.class).LJJJJZI(new AfS57S0100000_5(this, 271)));
                    C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.jh3));
                    C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.jfv));
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.jh3);
                    recyclerView.setAdapter(this.LJLIL);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.jg9), new ACListenerS25S0100000_5(this, 332));
                    ((TextView) _$_findCachedViewById(R.id.jf4)).addTextChangedListener(new IDObjectS178S0100000_5(this, 10));
                    return;
                }
            }
        }
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.h1p));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    public final long vl() {
        Room room;
        if (C29306Beo.LJJI() || C29306Beo.LJIILIIL(C51029K0z.LJIILIIL(this))) {
            return C025908h.LIZ();
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        int i2;
        ValueAnimator ofInt;
        Context context = getContext();
        if (context == null) {
            return;
        }
        int LIZ = i + ((int) B9K.LIZ(context, 35.0f));
        double LIZIZ = C81185Vtd.LIZIZ() * 0.9d;
        View view = this.LJLJI;
        if (view != null) {
            i2 = view.getHeight();
        } else {
            i2 = 0;
        }
        int min = Math.min(LIZ, (int) (LIZIZ - i2));
        if (z) {
            ofInt = ValueAnimator.ofInt(0, min);
            ofInt.setDuration(300L);
            ofInt.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        } else {
            ofInt = ValueAnimator.ofInt(min, 0);
            ofInt.setDuration(250L);
            ofInt.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        }
        ofInt.addUpdateListener(new AUListenerS94S0100000_5(this, 47));
        ofInt.start();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "entrance");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LJLJJI = str;
        this.LJLJI = view;
        this.LJLILLLLZI = (MeasureLinearLayout) view.findViewById(R.id.jgb);
        if (!C29306Beo.LJIILIIL(C51029K0z.LJIILIIL(this))) {
            initData();
            MeasureLinearLayout measureLinearLayout = this.LJLILLLLZI;
            if (measureLinearLayout != null) {
                measureLinearLayout.setWindowInsetsEnable(true);
            }
            MeasureLinearLayout measureLinearLayout2 = this.LJLILLLLZI;
            if (measureLinearLayout2 != null) {
                measureLinearLayout2.setWindowInsetsKeyboardObserver(this);
            }
        }
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.aer), new ACListenerS25S0100000_5(this, 210));
        if (C29306Beo.LJIILIIL(C51029K0z.LJIILIIL(this))) {
            ((C47121t6) _$_findCachedViewById(R.id.title)).LJJIJIL(R.style.a41);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                view.setLayoutParams(layoutParams);
            }
            TextView textView = (TextView) view.findViewById(R.id.ktp);
            if (textView != null) {
                String span = C15380j0.LJIILJJIL(R.string.mlj);
                String string = C15380j0.LJIILL(R.string.kbl, span);
                SpannableString spannableString = new SpannableString(string);
                o.LJIIIIZZ(string, "string");
                o.LJIIIIZZ(span, "span");
                int LJJLIIIJL = s.LJJLIIIJL(string, span, 0, false, 6);
                C23010vJ.LIZJ(textView.getContext(), spannableString, LJJLIIIJL, span.length() + LJJLIIIJL, 33, 5, 600);
                textView.setText(spannableString);
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && LJIILIIL.kv0(ModeratorListChannel.class) != null) {
                initData();
                View findViewById = view.findViewById(R.id.l8x);
                if (findViewById != null) {
                    C29306Beo.LJJLJLI(findViewById);
                    return;
                }
                return;
            }
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).EG(this.LJLJJL, vl());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cvo, viewGroup, false);
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
