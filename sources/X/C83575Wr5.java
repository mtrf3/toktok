package X;

import Y.AObserverS82S0100000_14;
import Y.ARunnableS33S0200000_14;
import Y.AgS130S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.dataChannel.GoLiveButtonClickEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.PreviewWrapperFragment;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.Wr5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83575Wr5 implements WU7 {
    public TTLiveBroadcastView LIZ;
    public volatile boolean LIZIZ;

    @Override // X.WU7
    public final void LIZ() {
    }

    @Override // X.WU7
    public final void LIZIZ() {
    }

    @Override // X.WU7
    public final void LIZJ() {
    }

    @Override // X.WU7
    public final void LIZLLL() {
    }

    @Override // X.WU7
    public final void LJFF() {
    }

    @Override // X.WU7
    public final void LJI() {
    }

    @Override // X.WU7
    public final void LJII() {
    }

    @Override // X.WU7
    public final void isZTLiveSwitch() {
    }

    @Override // X.WU7
    public final View LJIIJ() {
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView == null) {
            return null;
        }
        return tTLiveBroadcastView.LJLJJI;
    }

    @Override // X.WU7
    public final void LJIIIZ(View... viewArr) {
        C83577Wr7 c83577Wr7;
        View[] viewArr2;
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView == null || (c83577Wr7 = tTLiveBroadcastView.LJLJJLL) == null || (viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length)) == null) {
            return;
        }
        for (View view : viewArr2) {
            c83577Wr7.LIZLLL.add(view);
        }
    }

    @Override // X.WU7
    public final void LJIIJJI(ViewGroup viewGroup) {
        if (this.LIZ != null && this.LIZIZ) {
            TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
            if (tTLiveBroadcastView.LJLLILLLL) {
                tTLiveBroadcastView.LJLLILLLL = false;
                InterfaceC30046Bqk interfaceC30046Bqk = tTLiveBroadcastView.LJLJL;
                if (interfaceC30046Bqk != null) {
                    ((LiveBroadcastPreviewFragment) interfaceC30046Bqk).Jl();
                }
                C83577Wr7 c83577Wr7 = tTLiveBroadcastView.LJLJJLL;
                if (c83577Wr7 != null) {
                    c83577Wr7.LIZIZ = 2;
                    c83577Wr7.LIZ();
                }
                W5G w5g = tTLiveBroadcastView.LJLJJL;
                if (w5g != null) {
                    w5g.setVisibility(8);
                }
                WLZ wlz = tTLiveBroadcastView.LJLL;
                if (wlz != null) {
                    ((WUA) wlz).LIZ.useFilterSource("build_in", true);
                }
                InterfaceC83586WrG interfaceC83586WrG = tTLiveBroadcastView.LJLJLLL;
                if (interfaceC83586WrG != null) {
                    ((C83576Wr6) interfaceC83586WrG).LIZ.setFilter(C44172HVg.LJJ.LJIILL().LJ().LIZ(tTLiveBroadcastView.LJLLLL));
                }
            }
            this.LIZIZ = false;
            viewGroup.postDelayed(new ARunnableS33S0200000_14(this, viewGroup, 62), 300L);
        }
    }

    @Override // X.WU7
    public final boolean LJIIL(Context context) {
        LiveMode lastBroadcastLiveMode;
        InterfaceC30046Bqk interfaceC30046Bqk = this.LIZ.LJLJL;
        if (interfaceC30046Bqk != null && ((LiveBroadcastPreviewFragment) interfaceC30046Bqk).xl() != null) {
            InterfaceC30046Bqk interfaceC30046Bqk2 = this.LIZ.LJLJL;
            if (interfaceC30046Bqk2 != null) {
                lastBroadcastLiveMode = ((LiveBroadcastPreviewFragment) interfaceC30046Bqk2).xl();
            } else {
                return true;
            }
        } else {
            IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.get().getService(IBroadcastService.class);
            if (iBroadcastService != null) {
                lastBroadcastLiveMode = iBroadcastService.getLastBroadcastLiveMode(context);
            } else {
                return true;
            }
        }
        if (lastBroadcastLiveMode != null) {
            return lastBroadcastLiveMode.equals(LiveMode.VIDEO);
        }
        return true;
    }

    @Override // X.WU7
    public final void LJIILIIL(WU8 wu8) {
        C83577Wr7 c83577Wr7;
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        if (tTLiveBroadcastView != null && (c83577Wr7 = tTLiveBroadcastView.LJLJJLL) != null) {
            c83577Wr7.LJFF = wu8;
        }
    }

    @Override // X.WU7
    public final void LJ(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        if (this.LIZ == null && Live.getService() != null) {
            this.LIZ = new TTLiveBroadcastView(context, iRecordingOperationPanel);
        }
    }

    @Override // X.WU7
    public final void LJIIIIZZ(Bundle bundle, ViewGroup viewGroup) {
        boolean z;
        int i;
        WLZ wlz;
        InterfaceC83727WtX interfaceC83727WtX;
        int i2;
        int i3;
        int[] videoSize;
        int[] videoSize2;
        W5G w5g;
        LiveData<Float> zoomEvent;
        LifecycleOwner lifecycleOwner;
        FragmentManager fragmentManager;
        if (this.LIZ != null) {
            viewGroup.removeAllViews();
            this.LIZIZ = true;
            viewGroup.addView(this.LIZ.LJLJJI);
            TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
            tTLiveBroadcastView.getClass();
            if (tTLiveBroadcastView.LJLLILLLL) {
                return;
            }
            tTLiveBroadcastView.LJLLILLLL = true;
            if (tTLiveBroadcastView.LJLJL == null) {
                if (tTLiveBroadcastView.LJLJLJ == null) {
                    tTLiveBroadcastView.LJLJLJ = Live.getService().createStartLiveFragment(C17J.LJLJL);
                }
                InterfaceC30046Bqk interfaceC30046Bqk = tTLiveBroadcastView.LJLJLJ;
                tTLiveBroadcastView.LJLJL = interfaceC30046Bqk;
                if (interfaceC30046Bqk != null) {
                    LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) interfaceC30046Bqk;
                    liveBroadcastPreviewFragment.setArguments(bundle);
                    liveBroadcastPreviewFragment.Ol(tTLiveBroadcastView.LJZL);
                    PreviewWrapperFragment previewWrapperFragment = new PreviewWrapperFragment();
                    previewWrapperFragment.LJLIL = liveBroadcastPreviewFragment;
                    IRecordingOperationPanel iRecordingOperationPanel = tTLiveBroadcastView.LJLJI;
                    if (iRecordingOperationPanel != null && (fragmentManager = iRecordingOperationPanel.fragmentManager()) != null) {
                        C1B3 c1b3 = new C1B3(fragmentManager);
                        c1b3.LJIIJ(previewWrapperFragment, null, R.id.fvc);
                        c1b3.LJII();
                    }
                }
                LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(tTLiveBroadcastView.LJLIL);
                if (LIZIZ != null) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    IRecordingOperationPanel iRecordingOperationPanel2 = tTLiveBroadcastView.LJLILLLLZI;
                    if (iRecordingOperationPanel2 != null && (lifecycleOwner = iRecordingOperationPanel2.getLifecycleOwner()) != null) {
                        LIZIZ = lifecycleOwner;
                    }
                    dataChannelGlobal.nv0(tTLiveBroadcastView, LIZIZ, GoLiveButtonClickEvent.class, new AqS171S0100000_5(tTLiveBroadcastView, 888));
                }
                IRecordingOperationPanel iRecordingOperationPanel3 = tTLiveBroadcastView.LJLJI;
                if (iRecordingOperationPanel3 != null && (w5g = iRecordingOperationPanel3.backgroundView()) != null) {
                    w5g.setVisibility(8);
                } else {
                    w5g = null;
                }
                tTLiveBroadcastView.LJLJJL = w5g;
                tTLiveBroadcastView.LIZJ();
                Object obj = tTLiveBroadcastView.LJLJL;
                if (obj != null) {
                    Fragment fragment = (Fragment) obj;
                    IRecordingOperationPanel iRecordingOperationPanel4 = tTLiveBroadcastView.LJLJI;
                    if (iRecordingOperationPanel4 != null && (zoomEvent = iRecordingOperationPanel4.getZoomEvent()) != null) {
                        zoomEvent.observe(fragment, new AObserverS82S0100000_14(tTLiveBroadcastView, 73));
                    }
                }
            }
            InterfaceC30046Bqk interfaceC30046Bqk2 = tTLiveBroadcastView.LJLJL;
            if (interfaceC30046Bqk2 != null) {
                IRecordingOperationPanel iRecordingOperationPanel5 = tTLiveBroadcastView.LJLJI;
                if (iRecordingOperationPanel5 != null && (videoSize2 = iRecordingOperationPanel5.getVideoSize()) != null) {
                    i2 = videoSize2[0];
                } else {
                    i2 = 0;
                }
                IRecordingOperationPanel iRecordingOperationPanel6 = tTLiveBroadcastView.LJLJI;
                if (iRecordingOperationPanel6 != null && (videoSize = iRecordingOperationPanel6.getVideoSize()) != null) {
                    i3 = videoSize[1];
                } else {
                    i3 = 0;
                }
                ((LiveBroadcastPreviewFragment) interfaceC30046Bqk2).Pl(i2, i3);
            }
            IRecordingOperationPanel iRecordingOperationPanel7 = tTLiveBroadcastView.LJLJI;
            if (iRecordingOperationPanel7 != null && iRecordingOperationPanel7.getCameraPos() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (tTLiveBroadcastView.LJLJL != null) {
                if (z) {
                    C31014CFe.LJJIIJZLJL = 2;
                    i = 0;
                } else {
                    C31014CFe.LJJIIJZLJL = 1;
                    i = 1;
                }
                InterfaceC30442Bx8.LJIIIZ.LJ(Integer.valueOf(i));
            }
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).preLoadGameLiveCover();
            IRecordingOperationPanel iRecordingOperationPanel8 = tTLiveBroadcastView.LJLJI;
            if (iRecordingOperationPanel8 != null) {
                wlz = iRecordingOperationPanel8.filterModule();
            } else {
                wlz = null;
            }
            tTLiveBroadcastView.LJLL = wlz;
            InterfaceC30046Bqk interfaceC30046Bqk3 = tTLiveBroadcastView.LJLJL;
            if (interfaceC30046Bqk3 != null) {
                ((LiveBroadcastPreviewFragment) interfaceC30046Bqk3).Kl();
            }
            C83577Wr7 c83577Wr7 = tTLiveBroadcastView.LJLJJLL;
            if (c83577Wr7 != null) {
                c83577Wr7.LIZIZ = 1;
                c83577Wr7.LIZ();
            }
            InterfaceC83586WrG interfaceC83586WrG = tTLiveBroadcastView.LJZL.LIZ.LJLJLLL;
            if (interfaceC83586WrG != null && (interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ) != null) {
                interfaceC83727WtX.k();
            }
            C10K.LJII(100L).LJ(new AgS130S0100000_14(tTLiveBroadcastView, 6), C10K.LJIIIIZZ, null);
            W5G w5g2 = tTLiveBroadcastView.LJLJJL;
            if (w5g2 == null) {
                return;
            }
            w5g2.setVisibility(0);
        }
    }
}
