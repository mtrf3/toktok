package com.bytedance.android.livesdk.wishlistv2.debug;

import X.BCN;
import X.BCW;
import X.C10A;
import X.C15380j0;
import X.C15410j3;
import X.C28507BGt;
import X.C29927Bop;
import X.C30725C4b;
import X.C85663Xu;
import X.C85683Xw;
import X.RunnableC29953BpF;
import X.RunnableC29954BpG;
import X.RunnableC29955BpH;
import X.RunnableC29956BpI;
import Y.ARunnableS41S0100000_5;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStreamGoalDebugDialog extends LiveDialogFragment {
    public RecyclerView LJLIL;
    public IMessageManager LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d13);
        c28507BGt.LIZJ = R.style.abp;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 80;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        Window window;
        Window window2;
        View decorView;
        super.onStart();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            Object kv0 = dataChannel.kv0(BCW.class);
            o.LJI(kv0);
            boolean booleanValue = ((Boolean) kv0).booleanValue();
            if (booleanValue && C15410j3.LIZJ(getContext())) {
                z = true;
            } else {
                z = false;
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                if (!booleanValue || !C15410j3.LIZJ(getContext())) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
                if (z) {
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = C15380j0.LJIIL();
                    attributes.height = C15380j0.LJIIJJI() - C15380j0.LJIILIIL();
                    window.setAttributes(attributes);
                } else if (booleanValue) {
                    window.setLayout(-1, -1);
                } else {
                    window.setLayout(C15380j0.LJFF(R.dimen.adc), -1);
                }
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IMessageManager iMessageManager;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLILLLLZI = iMessageManager;
    }

    public final LiveStreamGoalServerMessage vl(long j) {
        long j2;
        Long l;
        LiveStreamGoalServerMessage liveStreamGoalServerMessage = new LiveStreamGoalServerMessage();
        liveStreamGoalServerMessage.baseMessage = new CommonMessageData();
        LiveStreamGoal liveStreamGoal = new LiveStreamGoal();
        liveStreamGoal.type = 1;
        liveStreamGoalServerMessage.goal = liveStreamGoal;
        LiveStreamSubGoal liveStreamSubGoal = new LiveStreamSubGoal();
        liveStreamSubGoal.type = 1;
        liveStreamSubGoal.target = 10L;
        liveStreamSubGoal.progress = j;
        liveStreamGoalServerMessage.contributeSubgoal = liveStreamSubGoal;
        StringBuffer stringBuffer = new StringBuffer("101");
        stringBuffer.append(C30725C4b.LIZ());
        stringBuffer.append(new Random(C30725C4b.LIZ()).nextInt(100));
        CommonMessageData commonMessageData = liveStreamGoalServerMessage.baseMessage;
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "messageIdBuilder.toString()");
        commonMessageData.messageId = CastLongProtector.parseLong(stringBuffer2);
        CommonMessageData commonMessageData2 = liveStreamGoalServerMessage.baseMessage;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        commonMessageData2.roomId = j2;
        return liveStreamGoalServerMessage;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.c3z);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.debug_list)");
        this.LJLIL = (RecyclerView) findViewById;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(1);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            C85663Xu c85663Xu = new C85663Xu();
            RecyclerView recyclerView2 = this.LJLIL;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c85663Xu);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C85683Xw("Start goal", new ARunnableS41S0100000_5(this, 264)));
                arrayList.add(new C85683Xw("50%", new ARunnableS41S0100000_5(this, 261)));
                arrayList.add(new C85683Xw("80%", new ARunnableS41S0100000_5(this, 262)));
                arrayList.add(new C85683Xw("100%", new ARunnableS41S0100000_5(this, 263)));
                arrayList.add(new C85683Xw("show indicator", RunnableC29955BpH.LJLIL));
                arrayList.add(new C85683Xw("hide indicator", RunnableC29956BpI.LJLIL));
                arrayList.add(new C85683Xw("expand to 200", RunnableC29953BpF.LJLIL));
                arrayList.add(new C85683Xw("Collapse to 100", RunnableC29954BpG.LJLIL));
                c85663Xu.LJLIL.clear();
                c85663Xu.LJLIL.addAll(arrayList);
                c85663Xu.notifyDataSetChanged();
                return;
            }
            o.LJIJI("mDebugList");
            throw null;
        }
        o.LJIJI("mDebugList");
        throw null;
    }
}
