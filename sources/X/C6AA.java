package X;

import Y.ARunnableS6S0101000_2;
import Y.IDObjectS119S0200000_2;
import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6AA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AA extends AbstractC029409q<C69V> {
    public final C6AL LJLIL;
    public final VideoPublishEditModel LJLILLLLZI;
    public View LJLJI;
    public String LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public final InterfaceC153045zY LJLJJLL;
    public RecyclerView LJLJL;
    public ArrayList<CaptionUtterance> LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public LinearLayoutManager LJLLLL;
    public final CaptionConfig LJLLLLLL;
    public final C6AD LJLZ;

    public final void LJLLLLLL() {
        C69V c69v;
        int i = this.LJLLI;
        if (i < 0 || i >= this.LJLJLJ.size()) {
            return;
        }
        RecyclerView recyclerView = this.LJLJL;
        RecyclerView.ViewHolder viewHolder = null;
        if (recyclerView != null) {
            viewHolder = recyclerView.LJJIZ(this.LJLLI);
        }
        if ((viewHolder instanceof C69V) && (c69v = (C69V) viewHolder) != null) {
            c69v.LJLJI.cancelAnimation();
            if (this.LJLJLLL == this.LJLLI) {
                c69v.LJLJI.setVisibility(8);
                c69v.LJLILLLLZI.setVisibility(0);
            }
        }
        this.LJLLI = -1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJLJ.size();
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        InterfaceC153045zY interfaceC153045zY = this.LJLJJLL;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.LLIIJLIL(this.LJLZ);
        }
        this.LJLJL = recyclerView;
        this.LJLLLL = (LinearLayoutManager) recyclerView.getLayoutManager();
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLJL = null;
        InterfaceC153045zY interfaceC153045zY = this.LJLJJLL;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.LLFF(this.LJLZ);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(C69V c69v) {
        C69V holder = c69v;
        o.LJIIIZ(holder, "holder");
        holder.LJLIL.setOnSelectionChangedListener(null);
        super.onViewRecycled(holder);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C69V c69v, final int i) {
        boolean z;
        boolean z2;
        final C69V p0 = c69v;
        o.LJIIIZ(p0, "p0");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fmc bind vh pos ");
        LIZ.append(i);
        LIZ.append(" hasFocus ");
        if (this.LJLJLLL == i) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        p0.LJLIL.setVisibility(0);
        p0.LJLIL.setText(((CaptionUtterance) ListProtector.get(this.LJLJLJ, i)).LIZLLL());
        if (this.LJLL == i) {
            this.LJLL = -1;
        }
        p0.LJLIL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.6AC
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SubtitleEditAdapter onFocusChanged hasFocus ");
                LIZ2.append(z3);
                H7B.LJ(X1D.LIZIZ(LIZ2));
                if (z3) {
                    C6AA.this.LJLJLLL = i;
                }
                C6AA.this.LJLZ(p0, i, z3);
            }
        });
        if (this.LJLJLLL == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJLZ(p0, i, z2);
        Object obj = ListProtector.get(this.LJLJLJ, i);
        o.LJIIIIZZ(obj, "list.get(pos)");
        final CaptionUtterance captionUtterance = (CaptionUtterance) obj;
        C134235Op.LIZIZ(p0.LJLILLLLZI, 0.75f);
        C16880lQ.LJIILLIIL(p0.LJLILLLLZI, new View.OnClickListener() { // from class: X.6AB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LJLLLLLL();
                C6AA c6aa = this;
                c6aa.LJLLI = i;
                InterfaceC153045zY interfaceC153045zY = c6aa.LJLJJLL;
                if (interfaceC153045zY != null) {
                    interfaceC153045zY.LLLFZ((int) captionUtterance.LIZIZ(), (int) captionUtterance.LIZ());
                }
                InterfaceC153045zY interfaceC153045zY2 = this.LJLJJLL;
                if (interfaceC153045zY2 != null) {
                    interfaceC153045zY2.play();
                }
                C29701Eo c29701Eo = p0.LJLJI;
                c29701Eo.setVisibility(0);
                c29701Eo.setAnimation("little_audio_wave_anim.json");
                c29701Eo.setRepeatCount(-1);
                c29701Eo.playAnimation();
                p0.LJLILLLLZI.setVisibility(8);
                C6AA c6aa2 = this;
                H8F.LJJIZ(0, c6aa2.LJLILLLLZI, c6aa2.LJLJJI, c6aa2.LJLLL);
            }
        });
        p0.LJLIL.setFilters(new InputFilter[]{new C157296Fh(new C6AG() { // from class: X.6A8
            @Override // X.C6AG
            public final void LIZ() {
                CaptionUtterance captionUtterance2;
                int selectionStart = p0.LJLIL.getSelectionStart();
                int length = captionUtterance.LIZLLL().length();
                if (selectionStart <= 0 || selectionStart >= length) {
                    return;
                }
                C6AA c6aa = this;
                CaptionUtterance captionUtterance3 = captionUtterance;
                int i2 = i;
                c6aa.getClass();
                int length2 = captionUtterance3.LIZLLL().length();
                if (selectionStart >= length2) {
                    return;
                }
                String substring = captionUtterance3.LIZLLL().substring(selectionStart, length2);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                long LIZ2 = captionUtterance3.LIZ();
                long j = length2;
                long LIZ3 = ((captionUtterance3.LIZ() - captionUtterance3.LIZIZ()) * selectionStart) / j;
                long LIZIZ = (LIZ2 - captionUtterance3.LIZIZ()) - LIZ3;
                StringBuilder LIZJ = V10.LIZJ("SubtitleEditAdapter -> firstDuration = ", LIZ3, "; secondDuration = ");
                LIZJ.append(LIZIZ);
                H7B.LIZ(X1D.LIZIZ(LIZJ));
                if (LIZ3 < 100 || LIZIZ < 100) {
                    C5S1 c5s1 = new C5S1(c6aa.LJLJJL);
                    c5s1.LIZJ(R.string.fmg);
                    c5s1.LJ();
                    return;
                }
                String substring2 = captionUtterance3.LIZLLL().substring(0, selectionStart);
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                captionUtterance3.LJ(c6aa.LJLJJL, substring2);
                long LIZ4 = (((captionUtterance3.LIZ() - captionUtterance3.LIZIZ()) * captionUtterance3.LIZLLL().length()) / j) + captionUtterance3.LIZIZ();
                TextStickerData textStickerData = captionUtterance3.inlineUtterance;
                if (textStickerData != null) {
                    textStickerData.setEndTime((int) LIZ4);
                }
                Utterance utterance = captionUtterance3.utterance;
                if (utterance != null) {
                    utterance.setEndTime(LIZ4);
                }
                TextStickerData textStickerData2 = captionUtterance3.inlineUtterance;
                if (textStickerData2 != null) {
                    TextStickerData m110clone = textStickerData2.m110clone();
                    m110clone.setTextStr(substring);
                    m110clone.setStartTime((int) (captionUtterance3.LIZ() + 1));
                    m110clone.setEndTime((int) LIZ2);
                    m110clone.setTextWrapList(C47261Igj.LJII(C68W.LIZJ(C68W.LJIILJJIL(m110clone, c6aa.LJLJJL))));
                    captionUtterance2 = new CaptionUtterance((Utterance) null, m110clone);
                } else {
                    captionUtterance2 = new CaptionUtterance(new Utterance(captionUtterance3.LIZ() + 1, LIZ2, substring, null, null, 0.0f, 0.0f, 0, 0, 504, null), (TextStickerData) null);
                }
                int i3 = i2 + 1;
                ListProtector.add(c6aa.LJLJLJ, i3, captionUtterance2);
                c6aa.LJLL = i2;
                c6aa.LJLJLLL = i3;
                c6aa.LJLLILLLL = 0;
                c6aa.notifyItemRangeChanged(i2, c6aa.getItemCount() - i2);
                RecyclerView recyclerView = c6aa.LJLJL;
                if (recyclerView == null) {
                    return;
                }
                recyclerView.post(new ARunnableS6S0101000_2(i3, c6aa, 10));
            }
        }), new C157326Fk(this.LJLLLLLL.getWordsPerLine())});
        p0.LJLIL.addTextChangedListener(new IDObjectS119S0200000_2(this, p0, 1));
        p0.LJLIL.setSoftKeyListener(new View.OnKeyListener() { // from class: X.6A9
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                TextView textView;
                int i3;
                if (view instanceof EditText) {
                    textView = (TextView) view;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    i3 = textView.getSelectionStart();
                } else {
                    i3 = 0;
                }
                if (keyEvent == null || keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || i3 != 0) {
                    return false;
                }
                C6AA c6aa = C6AA.this;
                CaptionUtterance captionUtterance2 = captionUtterance;
                int i4 = i;
                if (i4 == 0) {
                    c6aa.getClass();
                } else {
                    int i5 = i4 - 1;
                    CaptionUtterance captionUtterance3 = (CaptionUtterance) ListProtector.get(c6aa.LJLJLJ, i5);
                    long LIZ2 = captionUtterance2.LIZ();
                    TextStickerData textStickerData = captionUtterance3.inlineUtterance;
                    if (textStickerData != null) {
                        textStickerData.setEndTime((int) LIZ2);
                    }
                    Utterance utterance = captionUtterance3.utterance;
                    if (utterance != null) {
                        utterance.setEndTime(LIZ2);
                    }
                    int length = ((CaptionUtterance) ListProtector.get(c6aa.LJLJLJ, i5)).LIZLLL().length();
                    CaptionUtterance captionUtterance4 = (CaptionUtterance) ListProtector.get(c6aa.LJLJLJ, i5);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(((CaptionUtterance) ListProtector.get(c6aa.LJLJLJ, i5)).LIZLLL());
                    LIZ3.append(captionUtterance2.LIZLLL());
                    captionUtterance4.LJ(c6aa.LJLJJL, X1D.LIZIZ(LIZ3));
                    ListProtector.remove(c6aa.LJLJLJ, i4);
                    c6aa.LJLJLLL = i5;
                    c6aa.LJLLILLLL = length;
                    c6aa.LJLLJ = true;
                    c6aa.notifyItemRangeChanged(i5, (c6aa.getItemCount() - i4) + 2);
                    RecyclerView recyclerView = c6aa.LJLJL;
                    if (recyclerView != null) {
                        recyclerView.post(new ARunnableS6S0101000_2(i4, c6aa, 9));
                    }
                }
                return true;
            }
        });
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C69V com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup p0, int i) {
        o.LJIIIZ(p0, "p0");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJL), R.layout.cpg, p0, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…tle_edit_item, p0, false)");
        this.LJLJI = LLLLIILL;
        View view = this.LJLJI;
        if (view != null) {
            C69V c69v = new C69V(view);
            C0AX.LIZ(p0, c69v.itemView, R.id.lj7);
            View view2 = c69v.itemView;
            if (view2 != null) {
                view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(p0));
            }
            try {
                if (c69v.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C69V.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(p0.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) c69v.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(c69v.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C69V.class.getName();
            return c69v;
        }
        o.LJIJI("view");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.6AD] */
    public C6AA(C6AL panel, VideoPublishEditModel mModel, InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LJLIL = panel;
        this.LJLILLLLZI = mModel;
        this.LJLJJI = "";
        Activity requireActivity = panel.LIZIZ.requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJL = (ActivityC45651qj) requireActivity;
        this.LJLJJLL = editPreviewApi.Kh().getValue();
        this.LJLJLJ = new ArrayList<>();
        this.LJLL = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
        this.LJLLL = "";
        this.LJLLLLLL = new CaptionConfig(1, Integer.MAX_VALUE);
        this.LJLZ = new InterfaceC133905Ni() { // from class: X.6AD
            @Override // X.InterfaceC133905Ni
            public final void LIZ(int i, int i2, float f, String str) {
                if (i == 4098) {
                    C43045Guv.LIZLLL(new AqS152S0100000_2(C6AA.this, 707), 0L);
                }
            }
        };
        new W4V<InterfaceC81599W0t>() { // from class: X.6c8
            @Override // X.W4V, X.W4Z
            public final void LJFF(String str, Object obj, Animatable animatable) {
                if (animatable != null) {
                    animatable.start();
                }
            }
        };
    }

    public final void LJLZ(C69V c69v, int i, boolean z) {
        int i2;
        if (!z) {
            c69v.itemView.setBackgroundResource(0);
            c69v.LJLIL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, this.LJLJJL));
            c69v.LJLIL.clearFocus();
        } else {
            c69v.LJLIL.requestFocus();
            c69v.LJLIL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJLJJL));
            c69v.itemView.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d2, this.LJLJJL));
            int i3 = this.LJLLILLLL;
            if (i3 >= 0) {
                Editable text = c69v.LJLIL.getText();
                if (text != null) {
                    i2 = text.length();
                } else {
                    i2 = 0;
                }
                if (i3 <= i2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SubtitleEditAdapter set bind selection focusIndex ");
                    LIZ.append(this.LJLJLLL);
                    LIZ.append(" selectIndex ");
                    LIZ.append(this.LJLLILLLL);
                    H7B.LJ(X1D.LIZIZ(LIZ));
                    c69v.LJLIL.setSelection(this.LJLLILLLL);
                }
            }
            c69v.LJLIL.setOnSelectionChangedListener(new C6AH() { // from class: X.6AE
                @Override // X.C6AH
                public final void LIZ(int i4) {
                    C6AA c6aa = C6AA.this;
                    if (c6aa.LJLLJ) {
                        return;
                    }
                    c6aa.LJLLILLLL = i4;
                }
            });
            C6AL c6al = this.LJLIL;
            C6DT editText = c69v.LJLIL;
            c6al.getClass();
            o.LJIIIZ(editText, "editText");
            c6al.LJI.showSoftInput(editText, 1);
        }
        if (this.LJLLI == i) {
            if (z) {
                c69v.LJLILLLLZI.setVisibility(8);
                c69v.LJLJI.setVisibility(0);
                return;
            }
        } else if (z) {
            c69v.LJLILLLLZI.setVisibility(0);
            c69v.LJLJI.setVisibility(8);
            return;
        }
        c69v.LJLILLLLZI.setVisibility(8);
        c69v.LJLJI.setVisibility(8);
    }
}
