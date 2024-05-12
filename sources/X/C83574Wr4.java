package X;

import Y.AgS130S0100000_14;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VETouchPointer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wr4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83574Wr4 implements InterfaceC30359Bvn {
    public final /* synthetic */ TTLiveBroadcastView LIZ;

    @Override // X.InterfaceC30359Bvn
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIL() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJ() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIII(Bundle bundle) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJ() {
        InterfaceC83727WtX interfaceC83727WtX;
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null && (interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ) != null) {
            interfaceC83727WtX.LLIIIILZ();
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJII() {
        this.LIZ.LJLLJ = true;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILIIL() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.closeRecording();
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final int getCameraInfo() {
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            return iRecordingOperationPanel.getCameraInfo();
        }
        return 0;
    }

    public C83574Wr4(TTLiveBroadcastView tTLiveBroadcastView) {
        this.LIZ = tTLiveBroadcastView;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZ(String panel) {
        o.LJIIIZ(panel, "panel");
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onHidePanel(panel);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZJ(String panel) {
        o.LJIIIZ(panel, "panel");
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onShowPanel(panel);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIIIZZ(String[] strArr) {
        InterfaceC83586WrG interfaceC83586WrG;
        if (strArr == null || strArr.length == 0 || (interfaceC83586WrG = this.LIZ.LJLJLLL) == null) {
            return;
        }
        List LJJZZIII = ORY.LJJZZIII(strArr);
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
        if (interfaceC83727WtX == null) {
            return;
        }
        interfaceC83727WtX.m(C83576Wr6.LIZIZ(LJJZZIII, Collections.emptyList(), Collections.emptyList()));
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIJ(C40 c40) {
        this.LIZ.LJLZ = c40;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIJJI(InterfaceC30516ByK listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJZI.remove(listener);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILJJIL(InterfaceC30516ByK listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJZI.add(listener);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJ(String[] strArr) {
        LJJIIJZLJL(strArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // X.InterfaceC30359Bvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.Boolean r4) {
        /*
            r3 = this;
            boolean r2 = r4.booleanValue()
            com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings2 r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings2.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L2f
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView r0 = r3.LIZ
            com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L36
            int r1 = r0.getSurfaceSizeLayoutId()
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView r0 = r3.LIZ
            X.Bqk r0 = r0.LJLJL
            if (r0 == 0) goto L36
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r0 = r0.mo49getActivity()
            if (r0 == 0) goto L36
            android.view.View r0 = r0.findViewById(r1)
        L28:
            if (r2 == 0) goto L30
            if (r0 == 0) goto L2f
            X.C29306Beo.LJJLJLI(r0)
        L2f:
            return
        L30:
            if (r0 == 0) goto L2f
            X.C29306Beo.LJIIIZ(r0)
            goto L2f
        L36:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83574Wr4.LJIJJ(java.lang.Boolean):void");
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIFFI(int i) {
        this.LIZ.LIZLLL(i);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJII(C41 c41) {
        this.LIZ.LJZ = c41;
    }

    @Override // X.InterfaceC30359Bvn
    public final void closeCamera(Cert cert) {
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        tTLiveBroadcastView.LJLLL = true;
        IRecordingOperationPanel iRecordingOperationPanel = tTLiveBroadcastView.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.closeCamera(cert);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void openCamera(Cert cert) {
        C30351Bvf c30351Bvf;
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        IRecordingOperationPanel iRecordingOperationPanel = tTLiveBroadcastView.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.openCamera(cert);
            InterfaceC30046Bqk interfaceC30046Bqk = tTLiveBroadcastView.LJLJL;
            if (interfaceC30046Bqk != null) {
                LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) interfaceC30046Bqk;
                if (C28509BGv.LJI(liveBroadcastPreviewFragment.xl())) {
                    C30350Bve c30350Bve = liveBroadcastPreviewFragment.LJLJJI;
                    if (c30350Bve != null) {
                        C30355Bvj.LIZJ().LJJ(C0WE.LIZ(0, 0, c30350Bve.LJLLL, c30350Bve.LJLLLL, c30350Bve.getContext(), true));
                        c30350Bve.LJZ = System.currentTimeMillis();
                        InterfaceC08160Ts interfaceC08160Ts = c30350Bve.LJZI;
                        if (interfaceC08160Ts != null) {
                            ((C32241Oi) interfaceC08160Ts).LIZIZ();
                        }
                    }
                } else {
                    DataChannel dataChannel = liveBroadcastPreviewFragment.LJLILLLLZI;
                    if (dataChannel != null) {
                        if (C78685UuP.LJIJ(dataChannel) && (c30351Bvf = liveBroadcastPreviewFragment.LJLJI) != null) {
                            C30355Bvj.LIZJ().LJJ(C0WE.LIZ(0, 0, c30351Bvf.LJLLL, c30351Bvf.LJLLLL, c30351Bvf.getContext(), true));
                            c30351Bvf.LJZ = System.currentTimeMillis();
                            InterfaceC08160Ts interfaceC08160Ts2 = c30351Bvf.LJZI;
                            if (interfaceC08160Ts2 != null) {
                                ((C32241Oi) interfaceC08160Ts2).LIZIZ();
                            }
                        }
                    } else {
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                }
            }
            tTLiveBroadcastView.LJLLL = false;
            if (tTLiveBroadcastView.LJLLILLLL && tTLiveBroadcastView.LJLLJ) {
                C10K.LJII(1000L).LJ(new CMJ(tTLiveBroadcastView), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        boolean z;
        Boolean scaleCamera;
        o.LJIIIZ(scaleGestureDetector, "scaleGestureDetector");
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel == null || (scaleCamera = iRecordingOperationPanel.scaleCamera(scaleGestureDetector)) == null) {
            z = false;
        } else {
            z = scaleCamera.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC30359Bvn
    public final void setExposureCompensation(int i) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.setExposureCompensation(i);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJFF(String[] strArr, String[] strArr2) {
        LJIIIZ(strArr, strArr2);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIIZ(String[] strArr, String[] strArr2) {
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            C83576Wr6 c83576Wr6 = (C83576Wr6) interfaceC83586WrG;
            InterfaceC83727WtX interfaceC83727WtX = c83576Wr6.LIZIZ.LIZ;
            if (interfaceC83727WtX != null) {
                interfaceC83727WtX.j();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr2 == null || i >= strArr2.length) {
                    arrayList.add(strArr[i]);
                    arrayList2.add("");
                } else {
                    arrayList.add(strArr[i]);
                    arrayList2.add(strArr2[i]);
                }
            }
            List<ComposerInfo> LIZIZ = C83576Wr6.LIZIZ(arrayList, arrayList2, Collections.emptyList());
            InterfaceC83727WtX interfaceC83727WtX2 = c83576Wr6.LIZ;
            if (interfaceC83727WtX2 != null) {
                interfaceC83727WtX2.LLLLIIL(LIZIZ, 10000);
            }
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIL(int i, C78862UxG c78862UxG) {
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null && iRecordingOperationPanel.getCameraPos() != i) {
            iRecordingOperationPanel.setCameraPos(i, c78862UxG);
        }
        C10K.LJII(100L).LJ(new AgS130S0100000_14(this.LIZ, 1), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILL(LiveEffect sticker, String panel) {
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(panel, "panel");
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onStickerCancel(C78898Uxq.LIZ(sticker), panel);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJI(String[] strArr, String[] strArr2) {
        LJJIIJZLJL(strArr, strArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 != null) goto L15;
     */
    @Override // X.InterfaceC30359Bvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(com.bytedance.android.live.effect.model.FilterModel r5, float r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView r1 = r4.LIZ
            boolean r0 = r1.LJLLILLLL
            if (r0 == 0) goto La
            int r0 = r1.LJLLI
            if (r0 >= 0) goto Lb
        La:
            return
        Lb:
            X.WrG r3 = r1.LJLJLLL
            if (r3 == 0) goto La
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.services.IAVFilterService r2 = r0.filterService()
            if (r2 == 0) goto L37
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView r0 = r4.LIZ
            java.util.List<com.ss.android.ugc.aweme.filter.FilterBean> r1 = r0.LJLLLLLL
            int r0 = r0.LJLLI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.filter.FilterBean r0 = (com.ss.android.ugc.aweme.filter.FilterBean) r0
            java.lang.String r1 = r2.getFilterFolder(r0)
            if (r1 == 0) goto L37
        L2d:
            X.Wr6 r3 = (X.C83576Wr6) r3
            X.IAW r0 = r3.LIZIZ
            X.WtX r0 = r0.LIZ
            r0.setFilter(r1, r6)
            goto La
        L37:
            java.lang.String r1 = ""
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83574Wr4.LJIJJLI(com.bytedance.android.live.effect.model.FilterModel, float):void");
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIIJ(LiveEffect sticker, String panel) {
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(panel, "panel");
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.onStickerChosen(C78898Uxq.LIZ(sticker), panel);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIIJZLJL(String[] strArr, String[] strArr2) {
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            C83576Wr6 c83576Wr6 = (C83576Wr6) interfaceC83586WrG;
            InterfaceC83727WtX interfaceC83727WtX = c83576Wr6.LIZIZ.LIZ;
            if (interfaceC83727WtX != null) {
                interfaceC83727WtX.j();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr2 == null || i >= strArr2.length) {
                    arrayList.add(strArr[i]);
                    arrayList2.add("");
                } else {
                    arrayList.add(strArr[i]);
                    arrayList2.add(strArr2[i]);
                }
            }
            List<ComposerInfo> LIZIZ = C83576Wr6.LIZIZ(arrayList, arrayList2, Collections.emptyList());
            InterfaceC83727WtX interfaceC83727WtX2 = c83576Wr6.LIZ;
            if (interfaceC83727WtX2 != null) {
                interfaceC83727WtX2.i(LIZIZ, 10000);
            }
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final int LLIIIJ(String key, String imagePath) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(imagePath, "imagePath");
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
            if (interfaceC83727WtX != null) {
                return interfaceC83727WtX.LLIIIJ(key, imagePath);
            }
            return -1;
        }
        return 0;
    }

    @Override // X.YLK
    public final void processLongPressEvent(float f, float f2) {
        InterfaceC83586WrG videoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((C83576Wr6) videoRecorder).LJFF(f, f2, 3, 5);
        }
    }

    @Override // X.YLK
    public final void processRotationEvent(float f, float f2) {
        InterfaceC83586WrG videoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            float f3 = -f;
            InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) videoRecorder).LIZ;
            if (interfaceC83727WtX != null) {
                interfaceC83727WtX.X9(f3, f2);
            }
        }
    }

    @Override // X.YLK
    public final void processScaleEvent(float f, float f2) {
        InterfaceC83586WrG videoRecorder;
        InterfaceC83727WtX interfaceC83727WtX;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null && (interfaceC83727WtX = ((C83576Wr6) videoRecorder).LIZ) != null) {
            interfaceC83727WtX.Z9(f, f2);
        }
    }

    @Override // X.YLK
    public final void processTouchEvent(float f, float f2) {
        InterfaceC83586WrG videoRecorder;
        InterfaceC83727WtX interfaceC83727WtX;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null && (interfaceC83727WtX = ((C83576Wr6) videoRecorder).LIZ) != null) {
            interfaceC83727WtX.ma(f, f2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void setFilter(String var1, float f) {
        o.LJIIIZ(var1, "var1");
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.setFilter(var1, f);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void setRenderCacheString(String str, String value) {
        o.LJIIIZ(value, "value");
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            ((C83576Wr6) interfaceC83586WrG).LIZ.setRenderCacheString(str, value);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZIZ(String[] paths, String[] nodeTags, float[] fArr) {
        VERecorder vERecorder;
        int length;
        o.LJIIIZ(paths, "paths");
        o.LJIIIZ(nodeTags, "nodeTags");
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG == null || (vERecorder = ((C83576Wr6) interfaceC83586WrG).LIZLLL) == null || (length = paths.length) == 0 || paths.length != nodeTags.length || nodeTags.length != fArr.length) {
            return;
        }
        vERecorder.LIZIZ.updateMultiComposerNodes(length, paths, nodeTags, fArr);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIZILJ(String[] strArr, String[] newNodePaths, String[] extras) {
        List list;
        o.LJIIIZ(newNodePaths, "newNodePaths");
        o.LJIIIZ(extras, "extras");
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            if (strArr == null || (list = ORY.LJJZZIII(strArr)) == null) {
                list = C61878OQg.INSTANCE;
            }
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            List LJJZZIII = ORY.LJJZZIII(newNodePaths);
            List LJJZZIII2 = ORY.LJJZZIII(extras);
            List<ComposerInfo> LIZIZ = C83576Wr6.LIZIZ(list, c61878OQg, Collections.emptyList());
            List<ComposerInfo> LIZIZ2 = C83576Wr6.LIZIZ(LJJZZIII, LJJZZIII2, Collections.emptyList());
            InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
            if (interfaceC83727WtX != null) {
                interfaceC83727WtX.LLIIJI(LIZIZ, LIZIZ2, 10000);
            }
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJI(int i, int i2, MotionEvent e) {
        o.LJIIIZ(e, "e");
        float[] fArr = {e.getX(), e.getY()};
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLJI;
        if (iRecordingOperationPanel != null) {
            iRecordingOperationPanel.cameraFocus(i, i2, fArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void composerCheckNodeExclusion(String nodePath, String nodeTag, int[] iArr) {
        int[] iArr2;
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeTag, "nodeTag");
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            iArr2 = ((C83576Wr6) interfaceC83586WrG).LIZ.LLII(nodePath, nodeTag);
        } else {
            iArr2 = null;
        }
        if (iArr2 != null && iArr2.length == 2) {
            iArr[0] = iArr2[1];
        } else {
            iArr[0] = 0;
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void composerUpdateNode(String str, String str2, float f) {
        InterfaceC83586WrG interfaceC83586WrG;
        InterfaceC83727WtX interfaceC83727WtX;
        if (C78857UxB.LJJJIL(str) && C78857UxB.LJJJIL(str2) && (interfaceC83586WrG = this.LIZ.LJLJLLL) != null && (interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ) != null) {
            InterfaceC45910I0c l = interfaceC83727WtX.l();
            l.LIZIZ(str, str2, f);
            l.commit();
        }
    }

    @Override // X.YLK
    public final void processTouchDownEvent(float f, float f2, int i) {
        InterfaceC83586WrG videoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((C83576Wr6) videoRecorder).LJFF(f, f2, 0, i);
        }
    }

    @Override // X.YLK
    public final void processTouchUpEvent(float f, float f2, int i) {
        InterfaceC83586WrG videoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((C83576Wr6) videoRecorder).LJFF(f, f2, 2, i);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZLLL(int i, int i2, String str, String str2) {
        InterfaceC83727WtX interfaceC83727WtX;
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null && (interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ) != null) {
            interfaceC83727WtX.J3(i, i2, str, str2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIJL(int i, long j, long j2, String str) {
        InterfaceC83586WrG interfaceC83586WrG = this.LIZ.LJLJLLL;
        if (interfaceC83586WrG != null) {
            ((C83576Wr6) interfaceC83586WrG).LIZ.LJJIJL(i, j, j2, str);
        }
    }

    @Override // X.YLK
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        InterfaceC83586WrG videoRecorder;
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null) {
            ((C83576Wr6) videoRecorder).LJ(f, f2, f3, f4, f5);
        }
    }

    @Override // X.YLK
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        InterfaceC83586WrG videoRecorder;
        InterfaceC83727WtX interfaceC83727WtX;
        VETouchPointer vETouchPointer = new VETouchPointer();
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        vETouchPointer.setEvent(VETouchPointer.TouchEvent.CANCELED);
                    }
                } else {
                    vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
                }
            } else {
                vETouchPointer.setEvent(VETouchPointer.TouchEvent.MOVED);
            }
        } else {
            vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
        }
        vETouchPointer.setForce(f3);
        vETouchPointer.setPointerId((int) j);
        vETouchPointer.setX(f);
        vETouchPointer.setY(f2);
        vETouchPointer.setMajorRadius(f4);
        IRecordingOperationPanel iRecordingOperationPanel = this.LIZ.LJLILLLLZI;
        if (iRecordingOperationPanel != null && (videoRecorder = iRecordingOperationPanel.videoRecorder()) != null && (interfaceC83727WtX = ((C83576Wr6) videoRecorder).LIZ) != null) {
            interfaceC83727WtX.J9(vETouchPointer, i2);
        }
    }
}
