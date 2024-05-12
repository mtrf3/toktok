package com.ss.android.elearning.lingo.lynx.component.tts;

import X.C221108m2;
import X.C49615Jdb;
import X.C62822Ol8;
import X.C79981VaD;
import X.EWS;
import X.EnumC79976Va8;
import X.EnumC79977Va9;
import X.OSZ;
import X.VNL;
import X.VNU;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.FrameLayout;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.elearning.lingo.lynx.component.tts.NativeAudioLynxUI;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class NativeAudioLynxUI extends UISimpleView<FrameLayout> {
    public static final /* synthetic */ int LJLJJI = 0;
    public final VNU LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public String LJLJI;

    public final MediaPlayer LJIJJLI() {
        return (MediaPlayer) this.LJLILLLLZI.getValue();
    }

    public final void LJJ() {
        LJIJJLI().stop();
        LJIJJLI().reset();
        if (LJIJJLI().isPlaying()) {
            LJIL("playbackstatechanged", new OSZ<>("code", Integer.valueOf(EnumC79977Va9.Stopped.getValue())), new OSZ<>("type", EnumC79976Va8.Stopped.getValue()), new OSZ<>("currentSrcID", this.LJLJI));
        }
    }

    @EWS
    public final void stop() {
        LJJ();
    }

    public NativeAudioLynxUI(VNU vnu) {
        super(vnu);
        this.LJLIL = vnu;
        this.LJLILLLLZI = C221108m2.LIZIZ(C79981VaD.LJLIL);
        this.LJLJI = "";
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIIZ(context, "context");
        return new FrameLayout(context);
    }

    @EWS
    public final void playByBase64(ReadableMap params) {
        o.LJIIIZ(params, "params");
        final String string = params.getString("text");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = params.getString("base64Str");
        if (string2 != null) {
            str = string2;
        }
        this.LJLJI = string;
        try {
            LJJ();
            LJIJJLI().setDataSource(str);
            LJIJJLI().prepareAsync();
            LJIJJLI().setVolume(100.0f, 100.0f);
            LJIJJLI().setLooping(false);
            LJIJJLI().setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.VaB
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    NativeAudioLynxUI this$0 = NativeAudioLynxUI.this;
                    String text = string;
                    o.LJIIIZ(this$0, "this$0");
                    o.LJIIIZ(text, "$text");
                    mediaPlayer.start();
                    this$0.LJIL("playbackstatechanged", new OSZ<>("code", Integer.valueOf(EnumC79977Va9.Playing.getValue())), new OSZ<>("type", EnumC79976Va8.Playing.getValue()), new OSZ<>("currentSrcID", text));
                }
            });
            LJIJJLI().setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.VaA
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    NativeAudioLynxUI this$0 = NativeAudioLynxUI.this;
                    String text = string;
                    o.LJIIIZ(this$0, "this$0");
                    o.LJIIIZ(text, "$text");
                    this$0.LJIL("playbackstatechanged", new OSZ<>("code", Integer.valueOf(EnumC79977Va9.Stopped.getValue())), new OSZ<>("type", EnumC79976Va8.Finished.getValue()), new OSZ<>("currentSrcID", text));
                }
            });
            LJIJJLI().setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.VaC
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    NativeAudioLynxUI this$0 = NativeAudioLynxUI.this;
                    String text = string;
                    o.LJIIIZ(this$0, "this$0");
                    o.LJIIIZ(text, "$text");
                    this$0.LJIL("error", new OSZ<>("errorTip", KMP.LJ("mediaPlayer error: ", i)), new OSZ<>("text", text));
                    return true;
                }
            });
        } catch (Throwable unused) {
            LJIL("error", new OSZ<>("errorTip", "play by base64 exception"), new OSZ<>("text", string));
        }
    }

    public final void LJIL(String str, OSZ<String, ? extends Object>... oszArr) {
        VNL vnl;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), str);
        for (OSZ<String, ? extends Object> osz : oszArr) {
            c49615Jdb.LIZJ(osz.getSecond(), osz.getFirst());
        }
        VNU vnu = this.LJLIL;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
