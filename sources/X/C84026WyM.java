package X;

import Y.ARunnableS33S0200000_14;
import android.os.Handler;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.qr.PicScanner;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import kotlin.jvm.internal.o;

/* renamed from: X.WyM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84026WyM implements InterfaceC83759Wu3, MessageCenter.Listener {
    public InterfaceC84039WyZ LJLIL;
    public PicScanner LJLILLLLZI;
    public final Handler LJLJI;
    public final ARunnableS33S0200000_14 LJLJJI;
    public final VERecorder LJLJJL;
    public final InterfaceC83927Wwl LJLJJLL;
    public final InterfaceC65784Pro<Boolean> LJLJL;

    @Override // X.InterfaceC83759Wu3
    public final void release() {
        PicScanner picScanner = this.LJLILLLLZI;
        if (picScanner != null) {
            picScanner.release();
        }
        MessageCenter.removeListener(this);
    }

    @Override // X.InterfaceC83759Wu3
    public final void stop() {
        if (!this.LJLJJLL.LJJL()) {
            stopPicScan();
        }
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
        this.LJLJJL.LIZIZ.enableScan(false, 65536L);
    }

    @Override // X.InterfaceC83759Wu3
    public final void stopPicScan() {
        PicScanner picScanner = this.LJLILLLLZI;
        if (picScanner != null) {
            picScanner.stop();
        }
        ARunnableS33S0200000_14 aRunnableS33S0200000_14 = this.LJLJJI;
        if (aRunnableS33S0200000_14 != null) {
            this.LJLJI.removeCallbacks(aRunnableS33S0200000_14);
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC83759Wu3
    public final void LIZJ(C84043Wyd c84043Wyd) {
        this.LJLIL = c84043Wyd;
    }

    @Override // X.InterfaceC83759Wu3
    public final void pauseEffectAudio(boolean z) {
        this.LJLJJL.LIZIZ.pauseEffectAudio(z);
    }

    @Override // X.InterfaceC83759Wu3
    public final void processTouchEvent(float f, float f2) {
        this.LJLJJL.LIZIZ.processTouchEvent(f, f2);
    }

    public C84026WyM(InterfaceC83927Wwl recorderContext, VERecorder veRecorder, InterfaceC65784Pro interceptCallback) {
        o.LJIIIZ(veRecorder, "veRecorder");
        o.LJIIIZ(recorderContext, "recorderContext");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLJJL = veRecorder;
        this.LJLJJLL = recorderContext;
        this.LJLJL = interceptCallback;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
        this.LJLJJI = new ARunnableS33S0200000_14(this, 63);
    }

    @Override // X.InterfaceC83759Wu3
    public final void LIZIZ(String picPath, ScanSettings scanSettings, long j) {
        InterfaceC84039WyZ interfaceC84039WyZ;
        o.LJIIIZ(picPath, "picPath");
        stopPicScan();
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new PicScanner();
        }
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
        PicScanner picScanner = this.LJLILLLLZI;
        if ((picScanner == null || picScanner.start(picPath, scanSettings) < 0) && (interfaceC84039WyZ = this.LJLIL) != null) {
            interfaceC84039WyZ.onFail(-2000);
        }
        ARunnableS33S0200000_14 aRunnableS33S0200000_14 = this.LJLJJI;
        aRunnableS33S0200000_14.l0 = this.LJLILLLLZI;
        this.LJLJI.postDelayed(aRunnableS33S0200000_14, j);
    }

    @Override // X.InterfaceC83759Wu3
    public final int LIZ(float f, float f2, float f3, float f4) {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
        C84036WyW c84036WyW = new C84036WyW();
        c84036WyW.LIZ = f;
        c84036WyW.LIZIZ = f2;
        c84036WyW.LIZJ = f3;
        c84036WyW.LIZLLL = f4;
        c84036WyW.LJ = true;
        c84036WyW.LJFF = 65536L;
        return this.LJLJJL.LIZIZ().addTrackAlgorithm(0, 0, c84036WyW, 0, Integer.MAX_VALUE);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (!this.LJLJL.invoke().booleanValue() && i == 24) {
            PicScanner picScanner = this.LJLILLLLZI;
            if (picScanner != null) {
                InterfaceC84039WyZ interfaceC84039WyZ = this.LJLIL;
                if (interfaceC84039WyZ != null) {
                    o.LJI(picScanner);
                    interfaceC84039WyZ.LIZ(picScanner.getEnigmaResult());
                    return;
                }
                return;
            }
            EnigmaResult enigmaResult = this.LJLJJL.LIZIZ.getEnigmaResult();
            InterfaceC84039WyZ interfaceC84039WyZ2 = this.LJLIL;
            if (interfaceC84039WyZ2 == null) {
                return;
            }
            interfaceC84039WyZ2.LIZ(enigmaResult);
        }
    }

    @Override // X.InterfaceC83759Wu3
    public final void switchEffectWithTag(String strResPath, int i, int i2, String stickerTag) {
        o.LJIIIZ(strResPath, "strResPath");
        o.LJIIIZ(stickerTag, "stickerTag");
        VERecorder vERecorder = this.LJLJJL;
        vERecorder.getClass();
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = strResPath;
        vEEffectFilterParam.stickerId = i;
        vEEffectFilterParam.reqId = i2;
        vEEffectFilterParam.stickerTag = stickerTag;
        vERecorder.LIZIZ.switchEffect(vEEffectFilterParam);
    }
}
