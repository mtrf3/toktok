package X;

import Y.ACListenerS21S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDAListenerS36S0200000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel.MentionPanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import n.b;

/* renamed from: X.3XR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XR {
    public final View LIZ;
    public final WeakReference<Fragment> LIZIZ;
    public final C3XT LIZJ;
    public View LIZLLL;
    public RecyclerView LJ;
    public final MentionPanelViewModel LJFF;
    public final C3X9 LJI;
    public volatile boolean LJII;
    public int LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final long LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final LinearLayoutManager LJIILJJIL;

    public final ValueAnimator LIZ() {
        Object value = this.LJIIJJI.getValue();
        o.LJIIIIZZ(value, "<get-valueAnimator>(...)");
        return (ValueAnimator) value;
    }

    public final void LIZJ() {
        int i;
        Fragment fragment;
        AqS183S0100000_1 aqS183S0100000_1;
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "mentionPanelContainerView.context");
        Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZLLL, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJ = (RecyclerView) this.LIZ.findViewById(R.id.ggu);
        this.LIZLLL = this.LIZ.findViewById(R.id.geq);
        RecyclerView recyclerView = this.LJ;
        if (recyclerView != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(i);
            c110614Vt.LJIIIIZZ = C61328O5c.LIZJ(8);
            c110614Vt.LJIIIZ = C61328O5c.LIZJ(8);
            Context context2 = recyclerView.getContext();
            o.LJIIIIZZ(context2, "it.context");
            recyclerView.setBackground(c110614Vt.LIZ(context2));
            recyclerView.setLayoutManager(this.LJIILJJIL);
            C3X9 c3x9 = this.LJI;
            c3x9.LJLIL = i;
            MentionPanelViewModel mentionPanelViewModel = this.LJFF;
            if (mentionPanelViewModel != null) {
                aqS183S0100000_1 = mentionPanelViewModel.LLF;
            } else {
                aqS183S0100000_1 = null;
            }
            c3x9.LJLILLLLZI = aqS183S0100000_1;
            recyclerView.setAdapter(c3x9);
        }
        View view = this.LIZLLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 1), view);
        }
        ActivityC45651qj LJ = C1DG.LJ(this.LIZ, "mentionPanelContainerView.context");
        if (LJ != null) {
            this.LJIIIIZZ = b.LIZIZ(R.attr.ei, LJ);
        }
        MentionPanelViewModel mentionPanelViewModel2 = this.LJFF;
        if (mentionPanelViewModel2 != null && (fragment = this.LIZIZ.get()) != null) {
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "fragment.viewLifecycleOwner");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C3XV(mentionPanelViewModel2, this, null));
        }
        this.LJII = true;
    }

    public final void LJ() {
        this.LJIILJJIL.LJZL(0);
    }

    public final void LJFF() {
        if (!this.LJII) {
            LIZJ();
        }
        if (this.LJIIIZ) {
            C3H1.LIZIZ = "keyword";
            return;
        }
        this.LJIIIZ = true;
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        LIZ2.put("enter_method", C3H1.LIZIZ);
        LIZ2.put("enter_from", "chat");
        LIZ.LIZIZ("dm_mention_list_show", LIZ2);
        C3H1.LIZIZ = "keyword";
        RecyclerView recyclerView = this.LJ;
        if (recyclerView != null) {
            recyclerView.post(new ARunnableS37S0100000_1(this, 5));
        }
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LJII) {
            return;
        }
        if (!this.LJIIIZ) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            this.LJIIIZ = false;
            LIZ().removeAllUpdateListeners();
            C16880lQ.LJLJL(LIZ());
            LIZ().addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.LJIILIIL.getValue());
            LIZ().addListener(new IDAListenerS36S0200000_1(this, interfaceC65784Pro, 0));
            LIZ().reverse();
        }
    }

    public final void LIZLLL(String uid) {
        o.LJIIIZ(uid, "uid");
        MentionPanelViewModel mentionPanelViewModel = this.LJFF;
        if (mentionPanelViewModel != null) {
            mentionPanelViewModel.LJZI.remove(uid);
            if (mentionPanelViewModel.LJZI.isEmpty()) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(mentionPanelViewModel), null, null, new C80093Cj(mentionPanelViewModel, null), 3);
            }
            IMUser LJIIJ = C80533Eb.LJIIJ(uid, null);
            if (LJIIJ != null) {
                C3H1 c3h1 = mentionPanelViewModel.LJLJJLL;
                String uid2 = LJIIJ.getUid();
                o.LJIIIIZZ(uid2, "user.uid");
                C3H1.LIZIZ(c3h1, "delete_text", null, uid2, LJIIJ.getFollowStatus());
            }
            mentionPanelViewModel.refresh();
        }
    }

    public final void LJI(String key) {
        boolean z;
        Object value;
        ArrayList arrayList;
        o.LJIIIZ(key, "key");
        MentionPanelViewModel mentionPanelViewModel = this.LJFF;
        if (mentionPanelViewModel != null) {
            String lowerCase = key.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            boolean z2 = true;
            if (mentionPanelViewModel.LJZL.length() > 0 && ujb.o.LJJJLIIL(lowerCase, mentionPanelViewModel.LJZL, false)) {
                z = true;
            } else {
                z = false;
            }
            int size = mentionPanelViewModel.LJLLLLLL.size();
            mentionPanelViewModel.LJZL = lowerCase;
            XLM xlm = mentionPanelViewModel.LJLJLJ;
            do {
                value = xlm.getValue();
                if (z) {
                    List list = (List) mentionPanelViewModel.LJLJLJ.getValue();
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            String displayName = ((C3H6) obj).LJLIL.getDisplayName();
                            if (displayName != null) {
                                String lowerCase2 = displayName.toLowerCase(Locale.ROOT);
                                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (ujb.o.LJJJLIIL(lowerCase2, mentionPanelViewModel.LJZL, false)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (mentionPanelViewModel.LJZL.length() == 0) {
                    List<IMUser> gv0 = mentionPanelViewModel.gv0();
                    arrayList = new ArrayList(C32I.LJJL(gv0, 10));
                    for (IMUser iMUser : gv0) {
                        arrayList.add(new C3H6(iMUser, mentionPanelViewModel.LJZI.contains(iMUser.getUid()), size));
                    }
                } else {
                    List<IMUser> gv02 = mentionPanelViewModel.gv0();
                    arrayList = new ArrayList();
                    for (IMUser iMUser2 : gv02) {
                        String displayName2 = iMUser2.getDisplayName();
                        if (displayName2 != null) {
                            String lowerCase3 = displayName2.toLowerCase(Locale.ROOT);
                            o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (ujb.o.LJJJLIIL(lowerCase3, mentionPanelViewModel.LJZL, false)) {
                                arrayList.add(new C3H6(iMUser2, mentionPanelViewModel.LJZI.contains(iMUser2.getUid()), size));
                            }
                        }
                    }
                }
            } while (!xlm.compareAndSet(value, arrayList));
            Collection collection = (Collection) mentionPanelViewModel.LJLJLJ.getValue();
            if (collection != null && !collection.isEmpty()) {
                z2 = false;
            }
            if (z2) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(mentionPanelViewModel), null, null, new C80103Ck(mentionPanelViewModel, null), 3);
            } else {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(mentionPanelViewModel), null, null, new C80073Ch(mentionPanelViewModel, null), 3);
            }
        }
    }

    public C3XR(View view, WeakReference<Fragment> fragmentWeakReference, final C98563ts c98563ts, C3XT mentionPanelListener) {
        MentionPanelViewModel mentionPanelViewModel;
        o.LJIIIZ(fragmentWeakReference, "fragmentWeakReference");
        o.LJIIIZ(mentionPanelListener, "mentionPanelListener");
        this.LIZ = view;
        this.LIZIZ = fragmentWeakReference;
        this.LIZJ = mentionPanelListener;
        final String string = view.getContext().getString(R.string.eow);
        string = string == null ? "All" : string;
        Fragment fragment = fragmentWeakReference.get();
        if (fragment != null) {
            ViewModelProvider of = ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.3Rq
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                    return C09L.LIZIZ(this, cls, c0vk);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> modelClass) {
                    o.LJIIIZ(modelClass, "modelClass");
                    return new MentionPanelViewModel(C98563ts.this, string);
                }
            });
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MentionPanelViewModel-");
            LIZ.append(c98563ts.getConversationId());
            mentionPanelViewModel = (MentionPanelViewModel) of.get(X1D.LIZIZ(LIZ), MentionPanelViewModel.class);
        } else {
            mentionPanelViewModel = null;
        }
        this.LJFF = mentionPanelViewModel;
        this.LJI = new C3X9();
        this.LJIIJ = 150L;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 2));
        this.LJIIL = C221108m2.LIZIZ(C3XZ.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 3));
        view.getContext();
        this.LJIILJJIL = new LinearLayoutManager(0, false);
    }
}
