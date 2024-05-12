package com.ss.android.ugc.aweme.tag.assem;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C186927Vg;
import X.C186997Vn;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C234529Ii;
import X.C235119Kp;
import X.C242189ew;
import X.C242199ex;
import X.C242209ey;
import X.C242249f2;
import X.C252709vu;
import X.C43I;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C8YN;
import X.C9BE;
import X.C9KF;
import X.C9RM;
import X.InterfaceC242259f3;
import X.ORZ;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS157S0200000_4;
import Y.IDObjectS177S0100000_4;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTagHeaderAssem extends UIContentAssem implements InterfaceC242259f3 {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public EditText LJLJI;
    public View LJLJJI;
    public List<IMUser> LJLJJL;
    public boolean LJLJJLL;
    public Map<Integer, View> LJLJL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLJL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC242259f3, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public VideoTagHeaderAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagFriendsListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1040), C242209ey.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoTagSearchListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS153S0100000_3(LIZ2, 1041), C242199ex.INSTANCE, null);
        this.LJLJJL = new ArrayList();
    }

    public final VideoTagSearchListViewModel A3() {
        return (VideoTagSearchListViewModel) this.LJLILLLLZI.getValue();
    }

    public final void C3() {
        View view = this.LJLJJI;
        if (view != null) {
            view.setVisibility(8);
            EditText editText = this.LJLJI;
            if (editText != null) {
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                LJIJI();
                C242189ew c242189ew = C242189ew.LJLIL;
                Class<VideoTagHeaderAssem> cls = VideoTagHeaderAssem.class;
                Class<?>[] interfaces = cls.getInterfaces();
                o.LJIIIIZZ(interfaces, "currentClass.interfaces");
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls2 : interfaces) {
                    if (C8VB.class.isAssignableFrom(cls2)) {
                        arrayList.add(cls2);
                    }
                }
                while (arrayList.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls == null) {
                        return;
                    }
                    Class<?>[] interfaces2 = cls.getInterfaces();
                    o.LJIIIIZZ(interfaces2, "currentClass.interfaces");
                    arrayList = new ArrayList();
                    for (Class<?> cls3 : interfaces2) {
                        if (C8VB.class.isAssignableFrom(cls3)) {
                            arrayList.add(cls3);
                        }
                    }
                }
                C8VA LIZLLL = getSupervisor().LIZLLL();
                Object LJLLJ = ORZ.LJLLJ(arrayList);
                o.LJII(LJLLJ, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.assem.arch.service.AssemObservableService<DATA of com.bytedance.assem.arch.service.AssemServiceExtKt.setAssemServiceState>>");
                LIZLLL.LJI((Class) LJLLJ, c242189ew);
                return;
            }
            o.LJIJI("searchEditText");
            throw null;
        }
        o.LJIJI("closeBtn");
        throw null;
    }

    @Override // X.InterfaceC242259f3
    public void LJIJI() {
        EditText editText = this.LJLJI;
        if (editText != null) {
            if (editText.hasFocus()) {
                editText.clearFocus();
            }
            EditText editText2 = this.LJLJI;
            if (editText2 != null) {
                KeyboardUtils.LIZIZ(editText2);
                return;
            } else {
                o.LJIJI("searchEditText");
                throw null;
            }
        }
        o.LJIJI("searchEditText");
        throw null;
    }

    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C9RM defaultObservableData() {
        return new C9RM(new C43I(Boolean.FALSE), null);
    }

    public final VideoTagFriendsListViewModel x3() {
        return (VideoTagFriendsListViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Context context;
        String string;
        Context context2;
        String str;
        Context context3;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        if (C186997Vn.LIZ() != 2 && C186997Vn.LIZ() != 3 ? C186997Vn.LIZ() != 4 ? (context = getContext()) == null || (string = context.getString(R.string.s1w)) == null : (context2 = getContext()) == null || (string = context2.getString(R.string.s1v)) == null : (context3 = getContext()) == null || (string = context3.getString(R.string.s1u)) == null) {
            string = "";
        }
        if (C186997Vn.LIZJ()) {
            C252709vu c252709vu = (C252709vu) getContainerView().findViewById(R.id.l_2);
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 866));
            c235119Kp.LIZIZ(LIZJ);
            c252709vu.setNavActions(c235119Kp);
        } else {
            C252709vu c252709vu2 = (C252709vu) getContainerView().findViewById(R.id.l_2);
            C235119Kp c235119Kp2 = new C235119Kp();
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_x_mark;
            LIZJ2.LIZIZ(new AqS154S0100000_4(LIZ, 867));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp2, new AbstractC234519Ih[]{LIZJ2});
            LIZLLL.LIZJ = string;
            c235119Kp2.LIZJ = LIZLLL;
            c252709vu2.setNavActions(c235119Kp2);
        }
        EditText editText = (EditText) getContainerView().findViewById(R.id.jf9);
        int LIZ2 = C186997Vn.LIZ();
        if (2 <= LIZ2 && LIZ2 < 5) {
            Context context4 = editText.getContext();
            if (context4 != null) {
                str = context4.getString(R.string.s1z);
            } else {
                str = null;
            }
            editText.setHint(str);
        }
        editText.setOnFocusChangeListener(new IDCListenerS157S0200000_4(this, LIZ, 3));
        editText.addTextChangedListener(new IDObjectS177S0100000_4(this, 12));
        this.LJLJI = editText;
        TuxIconView tuxIconView = (TuxIconView) getContainerView().findViewById(R.id.avg);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 187));
        this.LJLJJI = tuxIconView;
        C8YN.LJII(this, x3(), new TBT() { // from class: X.9ez
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 201), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.9f0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 202), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.9f1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 200), 4);
        int LIZ3 = C186997Vn.LIZ();
        if (2 <= LIZ3 && LIZ3 < 5) {
            return;
        }
        C186927Vg.LIZIZ.LIZJ(LIZ, true, C242249f2.LJLIL);
    }
}
