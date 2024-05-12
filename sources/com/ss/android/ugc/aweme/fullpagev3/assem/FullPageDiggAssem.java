package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C184077Kh;
import X.C200177tN;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.SJC;
import Y.AObserverS71S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageDiggAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageDiggAssem extends BaseFullPageAssem {
    public final C214378bB LJLJJI;
    public GestureDetector LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public FullPageDiggAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PostDiggViewModel.class);
        C200177tN c200177tN = C200177tN.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 424);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c200177tN, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        MutableLiveData<OSZ<Float, Float>> mutableLiveData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJJL = new GestureDetector(getContext(), new SJC() { // from class: X.7tM
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent e) {
                int i;
                o.LJIIIZ(e, "e");
                if (((PostDiggViewModel) FullPageDiggAssem.this.LJLJJI.getValue()).iv0()) {
                    return super.onDoubleTap(e);
                }
                FullPageDiggAssem fullPageDiggAssem = FullPageDiggAssem.this;
                PostModeFullPageViewModel x3 = fullPageDiggAssem.x3();
                C200157tL c200157tL = new C200157tL(fullPageDiggAssem);
                x3.getClass();
                x3.withState(new AqS169S0100000_3(c200157tL, (InterfaceC65784Pro<C76800UCe>) 1007));
                View _$_findCachedViewById = FullPageDiggAssem.this._$_findCachedViewById(R.id.hp0);
                if (_$_findCachedViewById != null) {
                    i = _$_findCachedViewById.getMeasuredHeight();
                } else {
                    i = 0;
                }
                ((C5WY) FullPageDiggAssem.this._$_findCachedViewById(R.id.hz9)).LIZ(e.getX(), e.getY() + i);
                return super.onDoubleTap(e);
            }
        });
        IDTListenerS113S0100000_3 iDTListenerS113S0100000_3 = new IDTListenerS113S0100000_3(this, 19);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e3v);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnTouchListener(iDTListenerS113S0100000_3);
        }
        PostModeContainerViewModel v3 = v3();
        if (v3 != null && (mutableLiveData2 = v3.LLILLIZIL) != null) {
            mutableLiveData2.observe(this, new AObserverS71S0100000_3(this, 59));
        }
        PostModeContainerViewModel v32 = v3();
        if (v32 != null && (mutableLiveData = v32.LJLZ) != null) {
            mutableLiveData.observe(this, new AObserverS71S0100000_3(this, 61));
        }
    }
}
