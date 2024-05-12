package com.bytedance.android.livesdk.adminsetting.fastaddblockwords;

import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C28776BRc;
import X.C28777BRd;
import X.C28778BRe;
import X.C28787BRn;
import X.C2A7;
import X.C47121t6;
import X.C47261Igj;
import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC28779BRf;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFastAddBlockKeywordsFragment extends LiveDialogFragment implements InterfaceC28779BRf {
    public final List<String> LJLIL;
    public RecyclerView LJLJJI;
    public C28777BRd LJLJJL;
    public View LJLJJLL;
    public C2A7 LJLJL;
    public FrameLayout LJLJLJ;
    public C47121t6 LJLJLLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 107));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 105));
    public final C5H3 LJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 106));
    public final C28776BRc LJLLI = new C28776BRc(this);

    @Override // X.InterfaceC28779BRf
    public final void LLLLZIL(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cy7);
        c28507BGt.LIZJ = R.style.ab1;
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // X.InterfaceC28779BRf
    public final void Kb() {
        dismiss();
    }

    public LiveFastAddBlockKeywordsFragment(List<String> list) {
        this.LJLIL = list;
    }

    @Override // X.InterfaceC28779BRf
    public final void ih(List<BlockWordRecommend> list) {
        C28777BRd c28777BRd = this.LJLJJL;
        if (c28777BRd != null) {
            c28777BRd.LJLILLLLZI = list;
            c28777BRd.notifyDataSetChanged();
        }
        Iterator<BlockWordRecommend> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().selected) {
                z = true;
            }
        }
        if (z) {
            C2A7 c2a7 = this.LJLJL;
            if (c2a7 != null) {
                c2a7.LJJLL(R.style.a2z);
            }
            C2A7 c2a72 = this.LJLJL;
            if (c2a72 == null) {
                return;
            }
            c2a72.setEnabled(true);
            return;
        }
        C2A7 c2a73 = this.LJLJL;
        if (c2a73 != null) {
            c2a73.LJJLL(R.style.a2y);
        }
        C2A7 c2a74 = this.LJLJL;
        if (c2a74 == null) {
            return;
        }
        c2a74.setEnabled(false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        long j;
        User owner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = (RecyclerView) view.findViewById(R.id.j_s);
        this.LJLJJLL = view.findViewById(R.id.n_o);
        this.LJLJL = (C2A7) view.findViewById(R.id.aul);
        this.LJLJLJ = (FrameLayout) view.findViewById(R.id.der);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.m2v);
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 85), view2);
        }
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS25S0100000_5(this, 86));
        }
        C2A7 c2a7 = this.LJLJL;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 87));
        }
        C28777BRd c28777BRd = new C28777BRd(this.LJLLI);
        this.LJLJJL = c28777BRd;
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            recyclerView.setAdapter(c28777BRd);
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.LLIZLLLIL(1);
        flexboxLayoutManager.LLILZLL(2);
        flexboxLayoutManager.LLJ(2);
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(flexboxLayoutManager);
        }
        C28778BRe c28778BRe = (C28778BRe) this.LJLL.getValue();
        ((Boolean) this.LJLJI.getValue()).booleanValue();
        Room room = (Room) this.LJLILLLLZI.getValue();
        if (room == null || (owner = room.getOwner()) == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        Room room2 = (Room) this.LJLILLLLZI.getValue();
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        c28778BRe.getClass();
        c28778BRe.LJ = str;
        c28778BRe.LJFF = j;
        C28778BRe c28778BRe2 = (C28778BRe) this.LJLL.getValue();
        List<String> list = this.LJLIL;
        c28778BRe2.getClass();
        o.LJIIIZ(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new BlockWordRecommend(true, it.next()));
        }
        c28778BRe2.LIZLLL = arrayList;
        c28778BRe2.LIZ.ih(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BlockWordRecommend> list2 = c28778BRe2.LIZLLL;
        if (list2 != null) {
            Iterator<BlockWordRecommend> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().content);
            }
        }
        BZI LIZ = C28787BRn.LIZ("quick_add_suggest_keyword");
        LIZ.LJIILLIIL(c28778BRe2.LIZIZ);
        LIZ.LJIJJ(Integer.valueOf(arrayList2.size()), "num_words");
        LIZ.LJIJJ(arrayList2.toString(), "suggested_words");
        LIZ.LJJIIJZLJL();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (String str2 : this.LJLIL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = str2;
                if (i > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(str3);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setText(C15380j0.LJIILL(R.string.kec, stringBuffer));
    }
}
