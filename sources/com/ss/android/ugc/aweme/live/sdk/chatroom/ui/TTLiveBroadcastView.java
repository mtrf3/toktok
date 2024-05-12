package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import X.C10K;
import X.C2E1;
import X.C32537Cpp;
import X.C40;
import X.C41;
import X.C48459J0d;
import X.C78846Ux0;
import X.C83574Wr4;
import X.C83576Wr6;
import X.C83577Wr7;
import X.C83578Wr8;
import X.C83579Wr9;
import X.C83580WrA;
import X.C83581WrB;
import X.C83582WrC;
import X.C83743Wtn;
import X.CN1;
import X.HY4;
import X.HYR;
import X.InterfaceC30046Bqk;
import X.InterfaceC30442Bx8;
import X.InterfaceC30516ByK;
import X.InterfaceC83583WrD;
import X.InterfaceC83586WrG;
import X.InterfaceC83727WtX;
import X.ORZ;
import X.QD3;
import X.W5G;
import X.WLZ;
import X.X1D;
import Y.AgS130S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes15.dex */
public final class TTLiveBroadcastView implements GenericLifecycleObserver {
    public final Context LJLIL;
    public final IRecordingOperationPanel LJLILLLLZI;
    public final IRecordingOperationPanel LJLJI;
    public final FrameLayout LJLJJI;
    public W5G LJLJJL;
    public C83577Wr7 LJLJJLL;
    public InterfaceC30046Bqk LJLJL;
    public InterfaceC30046Bqk LJLJLJ;
    public InterfaceC83586WrG LJLJLLL;
    public WLZ LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public final List<FilterBean> LJLLLLLL;
    public C40 LJLZ;
    public C41 LJZ;
    public final ConcurrentHashSet<InterfaceC30516ByK> LJZI;
    public final C83574Wr4 LJZL;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        InterfaceC83586WrG interfaceC83586WrG;
        InterfaceC83727WtX interfaceC83727WtX;
        String LJIILLIIL = ((IEffectService) CN1.LIZ(IEffectService.class)).baseComposerManager().LJIILLIIL();
        String LJII = ((IEffectService) CN1.LIZ(IEffectService.class)).baseComposerManager().LJII();
        if (LJIILLIIL != null && LJII != null && (interfaceC83586WrG = this.LJLJLLL) != null && (interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ) != null) {
            interfaceC83727WtX.LLIIIJ(LJIILLIIL, LJII);
        }
    }

    public final void LIZJ() {
        String str;
        File[] listFiles;
        File[] listFiles2;
        InterfaceC30046Bqk interfaceC30046Bqk = this.LJLJL;
        if (interfaceC30046Bqk != null) {
            ArrayList arrayList = new ArrayList();
            for (LiveEffect liveEffect : ((LiveBroadcastPreviewFragment) interfaceC30046Bqk).LLF.LIZ()) {
                arrayList.add(new Pair(liveEffect.getName(), liveEffect.getFilterPath()));
            }
            if (arrayList.isEmpty() || arrayList.size() == ((ArrayList) this.LJLLLLLL).size()) {
                return;
            }
            ((ArrayList) this.LJLLLLLL).clear();
            List<FilterBean> list = this.LJLLLLLL;
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < arrayList.size()) {
                String str2 = (String) ((Pair) ListProtector.get(arrayList, i)).first;
                String str3 = (String) ((Pair) ListProtector.get(arrayList, i)).second;
                FilterBean filterBean = new FilterBean();
                i++;
                filterBean.setId(i);
                filterBean.setName(str2);
                if (str3 == null || str3.isEmpty()) {
                    str = "";
                } else {
                    File file = new File(str3);
                    if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory() && (listFiles2 = file2.listFiles()) != null) {
                                for (File file3 : listFiles2) {
                                    if (file3.getName().endsWith(".png")) {
                                        str = file3.getAbsolutePath();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    str = str3;
                }
                filterBean.setFilterFilePath(str);
                AVExternalServiceImpl.LIZ().filterService().setFilterFolder(filterBean, str3);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                LIZ.append("/thumbnail.jpg");
                filterBean.setThumbnailFilePath(X1D.LIZIZ(LIZ));
                arrayList2.add(filterBean);
            }
            ((ArrayList) list).addAll(arrayList2);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        int i;
        C83576Wr6 c83576Wr6;
        InterfaceC83727WtX interfaceC83727WtX;
        C83581WrB c83581WrB;
        InterfaceC30046Bqk interfaceC30046Bqk = this.LJLJL;
        if (interfaceC30046Bqk != null) {
            ((LiveBroadcastPreviewFragment) interfaceC30046Bqk).Ol(null);
        }
        InterfaceC83586WrG interfaceC83586WrG = this.LJLJLLL;
        if (interfaceC83586WrG != null) {
            C83576Wr6 c83576Wr62 = (C83576Wr6) interfaceC83586WrG;
            C83580WrA c83580WrA = c83576Wr62.LJ;
            if (c83580WrA != null) {
                c83576Wr62.LIZ.H9(c83580WrA);
            }
            c83576Wr62.LJ = null;
        }
        this.LJLJLLL = null;
        EventBus.LIZJ().LJIJ(this);
        IRecordingOperationPanel iRecordingOperationPanel = this.LJLJI;
        if (iRecordingOperationPanel != null) {
            i = iRecordingOperationPanel.getCameraPos();
        } else {
            i = 1;
        }
        AVExternalServiceImpl.LIZ().configService().avsettingsConfig().setDefaultFilterForCamera(i, this.LJLLLL);
        InterfaceC83586WrG interfaceC83586WrG2 = this.LJLJLLL;
        if (interfaceC83586WrG2 != null && (interfaceC83727WtX = (c83576Wr6 = (C83576Wr6) interfaceC83586WrG2).LIZ) != null && (c83581WrB = c83576Wr6.LJFF) != null) {
            interfaceC83727WtX.na(c83581WrB);
            c83576Wr6.LJFF = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLLILLLL && this.LJLLJ) {
            C10K.LJII(500L).LJ(new AgS130S0100000_14(this, 0), C10K.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView.LIZ(int):void");
    }

    public final void LIZLLL(int i) {
        String str;
        FilterBean filterBean;
        FilterBean filterBean2;
        LIZJ();
        List<FilterBean> list = this.LJLLLLLL;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!this.LJLLILLLL) {
            this.LJLLLL = i;
            return;
        }
        int i2 = this.LJLLI;
        if (i2 != i) {
            z = false;
        }
        if (!this.LJLLJ || i == -1) {
            return;
        }
        if ((i2 == -1 && i == 0) || z) {
            FilterBean filterBean3 = (FilterBean) ORZ.LJLLLLLL(0, this.LJLLLLLL);
            if (filterBean3 != null) {
                str = filterBean3.getName();
            } else {
                str = null;
            }
            if (i == 0 && (filterBean2 = (FilterBean) ORZ.LJLLLLLL(0, this.LJLLLLLL)) != null) {
                filterBean2.setName("");
            }
            LIZ(i);
            if (i != 0 || (filterBean = (FilterBean) ORZ.LJLLLLLL(0, this.LJLLLLLL)) == null) {
                return;
            }
            filterBean.setName(str);
            return;
        }
        LIZ(i);
    }

    @QD3
    public final void onCameraReverse(HY4 event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLLILLLL || !this.LJLLJ || this.LJLJL == null) {
            return;
        }
        boolean z = event.LJLIL;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIIIZ;
        Integer LIZIZ = c48459J0d.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "KEY_LIVE_CAMERA_TYPE.commonValue");
        if (LIZIZ.intValue() == z) {
            return;
        }
        c48459J0d.LJ(Integer.valueOf(z ? 1 : 0));
    }

    @QD3
    public final void onFilterChange(HYR event) {
        o.LJIIIZ(event, "event");
        FilterBean filterBean = event.LJLIL;
        int i = event.LJLILLLLZI;
        if (filterBean != null) {
            int size = ((ArrayList) this.LJLLLLLL).size();
            for (int i2 = 0; i2 < size; i2++) {
                if (o.LJ(filterBean, ListProtector.get(this.LJLLLLLL, i2))) {
                    i = i2;
                }
            }
        }
        LIZLLL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bef.effectsdk.message.MessageCenter$Listener, X.WrA] */
    public TTLiveBroadcastView(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        Lifecycle lifecycle;
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = iRecordingOperationPanel;
        this.LJLJI = iRecordingOperationPanel;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LJLJJI = frameLayout;
        new Bundle();
        this.LJLLI = -1;
        this.LJLLLLLL = new ArrayList();
        this.LJZI = new ConcurrentHashSet<>();
        this.LJZL = new C83574Wr4(this);
        Live.getService();
        EventBus.LIZJ().LJIILJJIL(this);
        if (iRecordingOperationPanel != null && (lifecycle = iRecordingOperationPanel.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C2E1.class)).LIZ = null;
        frameLayout.setVisibility(4);
        frameLayout.setId(R.id.fvc);
        this.LJLJJLL = new C83577Wr7(frameLayout);
        this.LJLJLJ = Live.getService().createStartLiveFragment(C78846Ux0.LJLILLLLZI);
        InterfaceC83586WrG videoRecorder = iRecordingOperationPanel != null ? iRecordingOperationPanel.videoRecorder() : null;
        this.LJLJLLL = videoRecorder;
        if (videoRecorder != null) {
            final C83578Wr8 c83578Wr8 = new C83578Wr8(this);
            C83576Wr6 c83576Wr6 = (C83576Wr6) videoRecorder;
            C83580WrA c83580WrA = c83576Wr6.LJ;
            if (c83580WrA != null) {
                c83576Wr6.LIZ.H9(c83580WrA);
            }
            ?? r1 = new MessageCenter.Listener() { // from class: X.WrA
                @Override // com.bef.effectsdk.message.MessageCenter.Listener
                public final void onMessageReceived(int i, int i2, int i3, String str) {
                    c83578Wr8.onMessageReceived(i, i2, i3, str);
                }
            };
            c83576Wr6.LJ = r1;
            c83576Wr6.LIZ.L9(r1);
        }
        InterfaceC83586WrG interfaceC83586WrG = this.LJLJLLL;
        if (interfaceC83586WrG != null) {
            C83579Wr9 c83579Wr9 = new C83579Wr9(this);
            InterfaceC83583WrD.LIZ.getClass();
            InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
            if (interfaceC83727WtX != null) {
                interfaceC83727WtX.F9(new C83743Wtn(c83579Wr9));
            }
        }
        InterfaceC83586WrG interfaceC83586WrG2 = this.LJLJLLL;
        if (interfaceC83586WrG2 != null) {
            C83582WrC c83582WrC = new C83582WrC(this);
            C83576Wr6 c83576Wr62 = (C83576Wr6) interfaceC83586WrG2;
            InterfaceC83727WtX interfaceC83727WtX2 = c83576Wr62.LIZ;
            if (interfaceC83727WtX2 != null) {
                if (c83576Wr62.LJFF == null) {
                    c83576Wr62.LJFF = new C83581WrB(c83582WrC);
                }
                interfaceC83727WtX2.ha(c83576Wr62.LJFF);
            }
        }
    }
}
