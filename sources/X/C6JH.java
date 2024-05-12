package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6JH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JH extends FrameLayout implements InterfaceC1549166d<C1558669u>, InterfaceC1549266e {
    public final int LJLIL;
    public C6JF LJLILLLLZI;
    public C1558669u LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    public final View LIZ(int i) {
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

    @Override // X.InterfaceC1549166d
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C1558669u LJIJ() {
        InteractStickerStruct interactStickerStruct;
        int i;
        C6JF c6jf = this.LJLILLLLZI;
        if (c6jf != null) {
            interactStickerStruct = c6jf.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        C1558669u c1558669u = this.LJLJI;
        int i2 = 0;
        if (c1558669u != null) {
            i = c1558669u.LJLILLLLZI;
            i2 = c1558669u.LJLJI;
        } else {
            i = 0;
        }
        return new C1558669u(interactStickerStruct, i, i2);
    }

    public final boolean LIZLLL() {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u == null || c1558669u.LJLJI == 0) {
            return false;
        }
        return true;
    }

    public final void LJ() {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dua, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
        addView(LLLLIILL);
        C6JK.LIZ = Math.max(C60996Nwm.LIZJ(getContext()) / 4, this.LJLIL);
        TextView textView = (TextView) LIZ(R.id.d03);
        final C6JM et_voting_sticker_title = (C6JM) LIZ(R.id.d03);
        o.LJIIIIZZ(et_voting_sticker_title, "et_voting_sticker_title");
        LIZ(R.id.d01);
        textView.addTextChangedListener(new TextWatcher(et_voting_sticker_title) { // from class: X.6JL
            public final EditText LJLIL;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.LJLIL = et_voting_sticker_title;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C6JK.LIZIZ(this.LJLIL, C6JK.LIZIZ);
                C6JK.LIZJ = C6JK.LIZ(this.LJLIL);
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C6JK.LIZJ(this.LJLIL, 10.0d);
            }
        });
        TextView textView2 = (TextView) LIZ(R.id.d01);
        final C6JM et_voting_sticker_option_1 = (C6JM) LIZ(R.id.d01);
        o.LJIIIIZZ(et_voting_sticker_option_1, "et_voting_sticker_option_1");
        final EditText editText = (EditText) LIZ(R.id.d02);
        textView2.addTextChangedListener(new TextWatcher(et_voting_sticker_option_1, editText) { // from class: X.6JJ
            public final EditText LJLIL;
            public final EditText LJLILLLLZI;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C6JK.LIZIZ(this.LJLIL, 1);
                String valueOf = String.valueOf(editable);
                if (s.LJJLIIIJJIZ(valueOf, '\r', 0, false, 6) >= 0 || s.LJJLIIIJJIZ(valueOf, '\n', 0, false, 6) >= 0) {
                    this.LJLIL.setText(ujb.o.LJJJJZ(ujb.o.LJJJJZ(valueOf, "\r", "", false), "\n", "", false));
                    EditText editText2 = this.LJLIL;
                    editText2.setSelection(editText2.getText().length());
                    C6JK.LIZLLL(this.LJLILLLLZI);
                }
            }

            {
                this.LJLIL = et_voting_sticker_option_1;
                this.LJLILLLLZI = editText;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C6JK.LIZJ(this.LJLIL, 20.0d);
            }
        });
        TextView textView3 = (TextView) LIZ(R.id.d02);
        final C6JM et_voting_sticker_option_2 = (C6JM) LIZ(R.id.d02);
        o.LJIIIIZZ(et_voting_sticker_option_2, "et_voting_sticker_option_2");
        final EditText editText2 = null;
        textView3.addTextChangedListener(new TextWatcher(et_voting_sticker_option_2, editText2) { // from class: X.6JJ
            public final EditText LJLIL;
            public final EditText LJLILLLLZI;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C6JK.LIZIZ(this.LJLIL, 1);
                String valueOf = String.valueOf(editable);
                if (s.LJJLIIIJJIZ(valueOf, '\r', 0, false, 6) >= 0 || s.LJJLIIIJJIZ(valueOf, '\n', 0, false, 6) >= 0) {
                    this.LJLIL.setText(ujb.o.LJJJJZ(ujb.o.LJJJJZ(valueOf, "\r", "", false), "\n", "", false));
                    EditText editText22 = this.LJLIL;
                    editText22.setSelection(editText22.getText().length());
                    C6JK.LIZLLL(this.LJLILLLLZI);
                }
            }

            {
                this.LJLIL = et_voting_sticker_option_2;
                this.LJLILLLLZI = editText2;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C6JK.LIZJ(this.LJLIL, 20.0d);
            }
        });
        Typeface LJIILIIL = C68M.LJIIJ().LJIILIIL("");
        if (LJIILIIL != null) {
            ((TextView) LIZ(R.id.d03)).setTypeface(LJIILIIL);
        }
        C6JK.LIZJ((EditText) LIZ(R.id.d03), 10.0d);
        C6JK.LIZJ((EditText) LIZ(R.id.d01), 20.0d);
        C6JK.LIZJ((EditText) LIZ(R.id.d02), 20.0d);
        LIZ(R.id.d01).setLayerType(1, null);
        LIZ(R.id.d02).setLayerType(1, null);
        View et_voting_sticker_option_12 = LIZ(R.id.d01);
        o.LJIIIIZZ(et_voting_sticker_option_12, "et_voting_sticker_option_1");
        C163526bM.LIZ(et_voting_sticker_option_12, ColorProtector.parseColor("#ffffff"), SFS.LJI(22.0d), ColorProtector.parseColor("#3d000000"), SFS.LJI(4.0d), 0, 0);
        View et_voting_sticker_option_22 = LIZ(R.id.d02);
        o.LJIIIIZZ(et_voting_sticker_option_22, "et_voting_sticker_option_2");
        C163526bM.LIZ(et_voting_sticker_option_22, ColorProtector.parseColor("#ffffff"), SFS.LJI(22.0d), ColorProtector.parseColor("#3d000000"), SFS.LJI(4.0d), 0, 0);
        LIZ(R.id.d03).setOnKeyListener(new View.OnKeyListener() { // from class: X.6JP
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (66 == i && keyEvent.getAction() == 0 && C6JK.LIZJ >= C6JK.LIZIZ) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u != null && LIZLLL()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public int getEndTime() {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u != null) {
            return c1558669u.LJLJI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549266e
    public Integer getInteractStickerType() {
        if (this.LJLILLLLZI != null) {
            return 3;
        }
        return null;
    }

    public final PollStruct getPollStruct() {
        PollStruct pollStruct = new PollStruct();
        pollStruct.setQuestion(String.valueOf(((C19K) LIZ(R.id.d03)).getText()));
        ArrayList arrayList = new ArrayList();
        PollStruct.OptionsBean optionsBean = new PollStruct.OptionsBean();
        optionsBean.setOptionText(String.valueOf(((C19K) LIZ(R.id.d01)).getText()));
        optionsBean.setPostOption(String.valueOf(((C19K) LIZ(R.id.d01)).getText()));
        arrayList.add(optionsBean);
        PollStruct.OptionsBean optionsBean2 = new PollStruct.OptionsBean();
        optionsBean2.setOptionText(String.valueOf(((C19K) LIZ(R.id.d02)).getText()));
        optionsBean2.setPostOption(String.valueOf(((C19K) LIZ(R.id.d02)).getText()));
        arrayList.add(optionsBean2);
        pollStruct.setOptions(arrayList);
        return pollStruct;
    }

    public int getStartTime() {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u != null) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public final void LJFF() {
        LIZ(R.id.d03).setVisibility(8);
        LIZ(R.id.flo).setVisibility(8);
        if (!ujb.o.LJJJJJL(String.valueOf(((C19K) LIZ(R.id.d03)).getText()))) {
            LIZ(R.id.d03).setVisibility(0);
            LIZ(R.id.flo).setVisibility(0);
        }
        Editable text = ((C19K) LIZ(R.id.d01)).getText();
        if (text == null || text.length() == 0) {
            ((TextView) LIZ(R.id.d01)).setText(R.string.tt_);
        }
        Editable text2 = ((C19K) LIZ(R.id.d02)).getText();
        if (text2 == null || text2.length() == 0) {
            ((TextView) LIZ(R.id.d02)).setText(R.string.tta);
        }
    }

    public final int getLastTouchedIndex() {
        if (((C6JM) LIZ(R.id.d03)).LJLJL > ((C6JM) LIZ(R.id.d01)).LJLJL) {
            if (((C6JM) LIZ(R.id.d03)).LJLJL < ((C6JM) LIZ(R.id.d02)).LJLJL && System.currentTimeMillis() - ((C6JM) LIZ(R.id.d02)).LJLJL < 1000) {
                return 2;
            }
        } else if (((C6JM) LIZ(R.id.d01)).LJLJL > ((C6JM) LIZ(R.id.d02)).LJLJL) {
            if (System.currentTimeMillis() - ((C6JM) LIZ(R.id.d01)).LJLJL < 1000) {
                return 1;
            }
        } else if (System.currentTimeMillis() - ((C6JM) LIZ(R.id.d02)).LJLJL < 1000) {
            return 2;
        }
        return 0;
    }

    public final boolean getInEditMode() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6JH(Context context) {
        super(context);
        this.LJLJL = C62850Ola.LJFF(context, "context");
        this.LJLIL = SFS.LJI(73.0d);
        LJ();
    }

    public final void LIZIZ(PollStruct pollStruct) {
        o.LJIIIZ(pollStruct, "pollStruct");
        ((TextView) LIZ(R.id.d03)).setText(pollStruct.getQuestion());
        ((TextView) LIZ(R.id.d01)).setText(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption());
        ((TextView) LIZ(R.id.d02)).setText(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption());
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u != null && LIZLLL()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u != null && LIZLLL()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u != null && LIZLLL()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJIIIZ(f, false);
    }

    public final void setController(C6JF controller) {
        o.LJIIIZ(controller, "controller");
        this.LJLILLLLZI = controller;
    }

    public final void setEditEnable(boolean z) {
        ((TextView) LIZ(R.id.d03)).setEnabled(z);
        ((TextView) LIZ(R.id.d01)).setEnabled(z);
        ((TextView) LIZ(R.id.d02)).setEnabled(z);
    }

    public final void setEditTextFocusable(int i) {
        LIZ(R.id.d03).setVisibility(0);
        LIZ(R.id.flo).setVisibility(0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C6JK.LIZLLL((EditText) LIZ(R.id.d02));
                return;
            }
            C6JK.LIZLLL((EditText) LIZ(R.id.d01));
            return;
        }
        C6JK.LIZLLL((EditText) LIZ(R.id.d03));
    }

    @Override // X.InterfaceC1549266e
    public void setEndTime(int i) {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLJI = i;
    }

    public final void setInEditMode(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setPlayPosition(long j) {
        this.LJLJJI = j;
    }

    public final void setPollStickerTimeEditData(C1558669u data) {
        o.LJIIIZ(data, "data");
        this.LJLJI = data;
    }

    @Override // X.InterfaceC1549266e
    public void setStartTime(int i) {
        C1558669u c1558669u = this.LJLJI;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLILLLLZI = i;
    }

    public final void setTouchEnable(boolean z) {
        ((C6JM) LIZ(R.id.d03)).setMode(z);
        ((C6JM) LIZ(R.id.d01)).setMode(z);
        ((C6JM) LIZ(R.id.d02)).setMode(z);
    }

    public final void setTouching(boolean z) {
        this.LJLJJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6JH(Context context, AttributeSet attr) {
        super(context, attr);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attr, "attr");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = SFS.LJI(73.0d);
        LJ();
    }

    @Override // X.InterfaceC1549266e
    public final void LJIIIZ(float f, boolean z) {
        setAlpha(f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C1558669u c1558669u, int i, int i2) {
        InteractStickerStruct interactStickerStruct;
        C1558669u c1558669u2 = c1558669u;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(c1558669u2.LJLIL);
        C6JF c6jf = this.LJLILLLLZI;
        if (c6jf != null) {
            interactStickerStruct = c6jf.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(interactStickerStruct);
        C1558669u c1558669u3 = this.LJLJI;
        if (c1558669u3 != null) {
            c1558669u3.LJLILLLLZI = c1558669u2.LJLILLLLZI;
            c1558669u3.LJLJI = c1558669u2.LJLJI;
        }
        if (LIZIZ != null && LIZIZ2 != null) {
            LIZIZ.setRotation(LIZIZ.getRotation() - LIZIZ2.getRotation());
            if (!o.LIZJ(LIZIZ2.getScale(), 0.0f)) {
                float floatValue = LIZIZ.getScale().floatValue();
                Float scale = LIZIZ2.getScale();
                o.LJIIIIZZ(scale, "newLocation.scale");
                LIZIZ.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LIZIZ);
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList);
            InteractStickerStruct interactStickerStruct2 = c1558669u2.LJLIL;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(json);
            }
            C6JF c6jf2 = this.LJLILLLLZI;
            if (c6jf2 != null) {
                c6jf2.LJJIIZ(false);
            }
            C6JF c6jf3 = this.LJLILLLLZI;
            if (c6jf3 != null) {
                c6jf3.LJJIIJZLJL(c1558669u2.LJLIL, Boolean.FALSE);
            }
            C6JF c6jf4 = this.LJLILLLLZI;
            if (c6jf4 != null) {
                c6jf4.LJJIIZ(true);
            }
        }
    }
}
