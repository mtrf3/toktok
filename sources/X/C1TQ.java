package X;

import Y.IDObjectS173S0100000;
import Y.IDfS124S0200000;
import Y.IDfS292S0100000;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordApi;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.1TQ */
/* loaded from: classes.dex */
public abstract class C1TQ extends FrameLayout implements InterfaceC14010gn {
    public final C14020go LJLIL;
    public InputFilter.LengthFilter LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    @Override // X.InterfaceC14010gn
    public final void LIZJ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // X.InterfaceC14010gn
    public final void LJ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract View LJI();

    public abstract void LJIIIZ();

    public abstract void LJIIJJI();

    public abstract int getLayoutId$livebroadcast_api_release();

    public int getMaxLinesInFoldedStatus$livebroadcast_api_release() {
        return 1;
    }

    public final void LJIIJ() {
        ((TextView) LJFF(R.id.amp)).setText(getContext().getString(R.string.mio, Integer.valueOf(this.LJLJJI)));
    }

    public final boolean getHasSheet$livebroadcast_api_release() {
        return this.LJLJJL;
    }

    public final int getMaxSingleWordLength$livebroadcast_api_release() {
        return this.LJLJJI;
    }

    public final long getMaxWordsCount$livebroadcast_api_release() {
        return this.LJLJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnAddSuccessCallback() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC14010gn
    public final void LIZ(BlockWord word) {
        o.LJIIIZ(word, "word");
        C05270Ip c05270Ip = (C05270Ip) LJFF(R.id.dj8);
        c05270Ip.getClass();
        c05270Ip.LJLJLJ = true;
        int childCount = c05270Ip.getChildCount() - 2;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                if (!o.LJ(((AppCompatTextView) c05270Ip.getChildAt(i).findViewById(R.id.aml)).getText(), word.content)) {
                    if (i == childCount) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    try {
                        if (C78996UzQ.LJJIIJZLJL(c05270Ip.getChildAt(i))) {
                            C78996UzQ.LJI();
                        }
                    } catch (Throwable unused) {
                    }
                    c05270Ip.removeViewAt(i);
                }
            }
        }
        LJIIJJI();
        BZI LIZ = C28787BRn.LIZ("livesdk_stopword_cancel");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(word.content, "context");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC14010gn
    public final void LIZIZ(BlockWord blockWord) {
        ((C05270Ip) LJFF(R.id.dj8)).LIZ(blockWord, LJI(), 0);
        LJIIJJI();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_stopword_set_success");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(blockWord.content, "context");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC14010gn
    public final void LLLLZIL(Throwable throwable) {
        String str;
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) throwable;
            switch (c29401Dk.getErrorCode()) {
                case 80070:
                    str = "limited";
                    break;
                case 80071:
                    str = "illegal";
                    break;
                case 80072:
                    str = "lengthy";
                    break;
                case 80073:
                    str = "existed";
                    break;
                default:
                    C30868C9o.LIZJ(R.string.sz0);
                    return;
            }
            String prompt = c29401Dk.getPrompt();
            o.LJIIIIZZ(prompt, "throwable.prompt");
            C30868C9o.LJI(prompt);
            BZI LIZ = C28787BRn.LIZ("livesdk_stopword_set_toast");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(str, "toast_type");
            LIZ.LJJIIJZLJL();
        }
    }

    public final void setHasSheet$livebroadcast_api_release(boolean z) {
        this.LJLJJL = z;
    }

    public final void setMaxSingleWordLength$livebroadcast_api_release(int i) {
        this.LJLJJI = i;
    }

    public final void setMaxWordsCount$livebroadcast_api_release(long j) {
        this.LJLJI = j;
    }

    public final void setOnAddSuccessCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJLL = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1TQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJL = C62850Ola.LJFF(context, "context");
        this.LJLIL = new C14020go(this);
        this.LJLJJI = 30;
        IDObjectS173S0100000 iDObjectS173S0100000 = new IDObjectS173S0100000(this, 2);
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener(context, this) { // from class: X.0gm
            public final /* synthetic */ C1TQ LJLIL;

            {
                this.LJLIL = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                String str;
                if (i2 != 4) {
                    return false;
                }
                if (C2NU.LIZ.LIZIZ()) {
                    String charSequence = textView.getText().toString();
                    if (ujb.o.LJJJJJL(charSequence)) {
                        C30868C9o.LIZJ(R.string.min);
                        return false;
                    }
                    C14020go c14020go = this.LJLIL.LJLIL;
                    BlockWord blockWord = new BlockWord(-1, s.LJZI(charSequence).toString());
                    c14020go.getClass();
                    BZI LIZ = C28787BRn.LIZ("livesdk_tns_add_keywords");
                    String str2 = c14020go.LIZJ;
                    if (str2 != null) {
                        LIZ.LJIIJJI(str2);
                        LIZ.LJIJJ(blockWord.content, "keyword");
                        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis()), "timestamp");
                        if (c14020go.LIZLLL) {
                            str = "host";
                        } else {
                            str = "moderator";
                        }
                        LIZ.LJIJJ(str, "modified_by");
                        LIZ.LJJIIJZLJL();
                        C1EW.LIZ(c14020go.LIZIZ.addBlockWord(blockWord.content, c14020go.LJ, c14020go.LJFF)).LJJJLIIL(new IDfS124S0200000(c14020go, blockWord, 5), new IDfS124S0200000(c14020go, blockWord, 6));
                        textView.setText("");
                        return true;
                    }
                    o.LJIJI("eventPage");
                    throw null;
                }
                C30868C9o.LIZJ(R.string.n0o);
                return false;
            }
        };
        FrameLayout.inflate(getContext(), getLayoutId$livebroadcast_api_release(), this);
        ((TextView) LJFF(R.id.amo)).addTextChangedListener(iDObjectS173S0100000);
        ((TextView) LJFF(R.id.amo)).setOnEditorActionListener(onEditorActionListener);
        LJIIIZ();
        ((C05270Ip) LJFF(R.id.dj8)).setDeleteListener(new IDqS416S0100000(this, 217));
        ((C05270Ip) LJFF(R.id.dj8)).setMaxLinesInFoldStatus(getMaxLinesInFoldedStatus$livebroadcast_api_release());
        LJIIJJI();
        LJIIJ();
    }

    @Override // X.InterfaceC14010gn
    public final void LIZLLL(List<BlockWord> list, long j, long j2) {
        this.LJLJI = j;
        this.LJLJJI = (int) j2;
        for (BlockWord blockWord : list) {
            C05270Ip flow_layout = (C05270Ip) LJFF(R.id.dj8);
            o.LJIIIIZZ(flow_layout, "flow_layout");
            flow_layout.LIZ(blockWord, LJI(), flow_layout.getChildCount() - 1);
        }
        LJIIJJI();
        LJIIJ();
    }

    public static /* synthetic */ void LJIIIIZZ(C1TQ c1tq, boolean z, String str, long j, String str2) {
        c1tq.LJII(str, j, str2, z, false);
    }

    public final void LJII(String str, long j, String str2, boolean z, boolean z2) {
        C14020go c14020go = this.LJLIL;
        c14020go.getClass();
        c14020go.LIZLLL = z;
        c14020go.LJ = str;
        c14020go.LJFF = j;
        c14020go.LIZJ = str2;
        C14020go c14020go2 = this.LJLIL;
        BlockWordApi blockWordApi = c14020go2.LIZIZ;
        String str3 = c14020go2.LJ;
        str3.toString();
        C1EW.LIZ(blockWordApi.getBlockWord(str3, c14020go2.LJFF)).LJJJLIIL(new IDfS292S0100000(c14020go2, 25), new IDfS292S0100000(c14020go2, 26));
        this.LJLJJL = z2;
    }
}
