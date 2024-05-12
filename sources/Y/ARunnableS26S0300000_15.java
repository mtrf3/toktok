package Y;

import X.AV1;
import X.BinderC84205X2z;
import X.C245649kW;
import X.C84923XUp;
import X.C86268XtQ;
import X.C86428Xw0;
import X.C86431Xw3;
import X.C86433Xw5;
import X.InterfaceC37146Ehy;
import X.InterfaceC86436Xw8;
import X.ViewOnTouchListenerC86418Xvq;
import X.YRW;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ARunnableS26S0300000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        C86431Xw3 c86431Xw3 = (C86431Xw3) this.l0;
        TextView textView = c86431Xw3.LJLJJI;
        PollStruct pollStruct = (PollStruct) this.l1;
        String str2 = null;
        if (pollStruct != null && (options2 = pollStruct.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 0)) != null) {
            str = optionsBean2.getOptionText();
        } else {
            str = null;
        }
        textView.setText(c86431Xw3.LIZ(str));
        C86431Xw3 c86431Xw32 = (C86431Xw3) this.l0;
        TextView textView2 = c86431Xw32.LJLJLJ;
        PollStruct pollStruct2 = (PollStruct) this.l1;
        if (pollStruct2 != null && (options = pollStruct2.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, 1)) != null) {
            str2 = optionsBean.getOptionText();
        }
        textView2.setText(c86431Xw32.LIZ(str2));
        C86433Xw5 c86433Xw5 = ((C86431Xw3) this.l0).LJLJI;
        if (c86433Xw5 != null) {
            c86433Xw5.setListener((InterfaceC86436Xw8) this.l2);
        }
        C86433Xw5 c86433Xw52 = ((C86431Xw3) this.l0).LJLJL;
        if (c86433Xw52 != null) {
            c86433Xw52.setListener((InterfaceC86436Xw8) this.l2);
        }
        C86431Xw3 c86431Xw33 = (C86431Xw3) this.l0;
        c86431Xw33.setStatus(c86431Xw33.getPollStatus());
        C86431Xw3 c86431Xw34 = (C86431Xw3) this.l0;
        c86431Xw34.post(new ARunnableS51S0100000_15(c86431Xw34, 123));
    }

    public final void LIZ$1() {
        PollStruct pollStruct;
        C86431Xw3 c86431Xw3 = (C86431Xw3) this.l0;
        InteractStickerStruct interactStickerStruct = ((C86428Xw0) this.l1).LJLJLLL;
        if (interactStickerStruct != null) {
            pollStruct = interactStickerStruct.getPollStruct();
        } else {
            pollStruct = null;
        }
        boolean LJIJ = AV1.LJIJ(((C245649kW) this.l2).LIZJ);
        C245649kW c245649kW = (C245649kW) this.l2;
        String str = c245649kW.LIZLLL;
        if (str == null) {
            str = "";
        }
        c86431Xw3.LJI(pollStruct, LJIJ, str, c245649kW.LJIILL, ((C86428Xw0) this.l1).LJLJLLL);
        ((C86428Xw0) this.l1).LJLLL.LJIIIIZZ(((C86431Xw3) this.l0).getPollView());
        ((C86431Xw3) this.l0).postInvalidate();
    }

    public static final void run$0(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((C86268XtQ) aRunnableS26S0300000_15.l0).LJLILLLLZI.LIZIZ();
            ((InterfaceC37146Ehy) aRunnableS26S0300000_15.l1).LIZJ(1, "uploadSuccess", (JSONArray) aRunnableS26S0300000_15.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((C86268XtQ) aRunnableS26S0300000_15.l0).LJLILLLLZI.LIZIZ();
            ((InterfaceC37146Ehy) aRunnableS26S0300000_15.l1).LIZJ(1, "uploadSuccess", (JSONObject) aRunnableS26S0300000_15.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        C84923XUp c84923XUp = (C84923XUp) aRunnableS26S0300000_15.l0;
        c84923XUp.LJFF.LJ.LLLZZIL((Effect) aRunnableS26S0300000_15.l1, (MusicModel) aRunnableS26S0300000_15.l2);
    }

    public static final void run$3(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((ViewPropertyAnimator) aRunnableS26S0300000_15.l0).scaleX(1.0f);
            ((ViewPropertyAnimator) aRunnableS26S0300000_15.l0).scaleY(1.0f);
            ((ViewPropertyAnimator) aRunnableS26S0300000_15.l0).setDuration(150L);
            ((ViewPropertyAnimator) aRunnableS26S0300000_15.l0).withEndAction(new ARunnableS34S0200000_15((ViewOnTouchListenerC86418Xvq) aRunnableS26S0300000_15.l1, (View) aRunnableS26S0300000_15.l2, 33));
            ((ViewPropertyAnimator) aRunnableS26S0300000_15.l0).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((BinderC84205X2z) aRunnableS26S0300000_15.l2).LJLILLLLZI.onRetry((DownloadInfo) aRunnableS26S0300000_15.l0, (BaseException) aRunnableS26S0300000_15.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((BinderC84205X2z) aRunnableS26S0300000_15.l2).LJLILLLLZI.onRetryDelay((DownloadInfo) aRunnableS26S0300000_15.l0, (BaseException) aRunnableS26S0300000_15.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((BinderC84205X2z) aRunnableS26S0300000_15.l2).LJLILLLLZI.onFailed((DownloadInfo) aRunnableS26S0300000_15.l0, (BaseException) aRunnableS26S0300000_15.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            ((YRW) aRunnableS26S0300000_15.l0).LJIIJ((OnIMMessageListener) aRunnableS26S0300000_15.l1, (IMessage) aRunnableS26S0300000_15.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            aRunnableS26S0300000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS26S0300000_15 aRunnableS26S0300000_15) {
        boolean LIZ;
        try {
            aRunnableS26S0300000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS26S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
