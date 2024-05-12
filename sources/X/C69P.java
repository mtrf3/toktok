package X;

import Y.ACListenerS20S0201000_2;
import Y.ARunnableS6S0101000_2;
import Y.IDObjectS119S0200000_2;
import android.content.Context;
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
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.69P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69P extends AbstractC029409q<C145085mi> {
    public final VideoPublishEditModel LJLIL;
    public final EditorProContext LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final C69T LJLJJL;
    public View LJLJJLL;
    public final ArrayList<TextStickerData> LJLJL;
    public RecyclerView LJLJLJ;
    public LinearLayoutManager LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public Context LJLLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJL.size();
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJLJ = recyclerView;
        this.LJLJLLL = (LinearLayoutManager) recyclerView.getLayoutManager();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C145085mi c145085mi, final int i) {
        boolean z;
        final C145085mi holder = c145085mi;
        o.LJIIIZ(holder, "holder");
        holder.LJLIL.setVisibility(0);
        holder.LJLIL.setText(((TextStickerData) ListProtector.get(this.LJLJL, i)).getTextStr());
        if (this.LJLLI == i) {
            this.LJLLI = -1;
        }
        holder.LJLIL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.69S
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SubtitleEditAdapter onFocusChanged hasFocus ");
                LIZ.append(z2);
                H7B.LJ(X1D.LIZIZ(LIZ));
                if (z2) {
                    this.LJLL = i;
                }
                this.LJLLLLLL(holder, i, z2);
            }
        });
        if (this.LJLL == i) {
            z = true;
        } else {
            z = false;
        }
        LJLLLLLL(holder, i, z);
        C134235Op.LIZIZ(holder.LJLILLLLZI, 0.75f);
        C16880lQ.LJIILLIIL(holder.LJLILLLLZI, new ACListenerS20S0201000_2(i, this, holder, 6));
        holder.LJLIL.setFilters(new InputFilter[]{new C157296Fh(new C6AG() { // from class: X.69O
            @Override // X.C6AG
            public final void LIZ() {
                int selectionStart = holder.LJLIL.getSelectionStart();
                String textStr = ((TextStickerData) ListProtector.get(this.LJLJL, i)).getTextStr();
                o.LJI(textStr);
                int length = textStr.length();
                if (selectionStart <= 0 || selectionStart >= length) {
                    return;
                }
                C69P c69p = this;
                Object obj = ListProtector.get(c69p.LJLJL, i);
                o.LJIIIIZZ(obj, "list[pos]");
                TextStickerData textStickerData = (TextStickerData) obj;
                int i2 = i;
                String textStr2 = textStickerData.getTextStr();
                o.LJI(textStr2);
                int length2 = textStr2.length();
                int startTime = textStickerData.getStartTime();
                int endTime = textStickerData.getEndTime();
                TextStickerData textStickerData2 = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null);
                if (selectionStart < length2) {
                    if (textStickerData.getTextStr() != null) {
                        int endTime2 = ((textStickerData.getEndTime() - textStickerData.getStartTime()) * selectionStart) / length2;
                        int i3 = (endTime - startTime) - endTime2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> firstDuration = ");
                        LIZ.append(endTime2);
                        LIZ.append("; secondDuration = ");
                        LIZ.append(i3);
                        H7B.LIZ(X1D.LIZIZ(LIZ));
                        if (endTime2 < 100 || i3 < 100) {
                            Context context = c69p.LJLLLL;
                            if (context != null) {
                                C5S1 c5s1 = new C5S1(context);
                                c5s1.LIZJ(R.string.fmg);
                                c5s1.LJ();
                                return;
                            }
                            o.LJIJI("context");
                            throw null;
                        }
                    }
                    String textStr3 = textStickerData.getTextStr();
                    o.LJI(textStr3);
                    String substring = textStr3.substring(selectionStart, length2);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String textStr4 = textStickerData.getTextStr();
                    o.LJI(textStr4);
                    String substring2 = textStr4.substring(0, selectionStart);
                    o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Context context2 = c69p.LJLLLL;
                    if (context2 != null) {
                        C78841Uwv.LJJJJJL(textStickerData, substring2, context2);
                        int startTime2 = textStickerData.getStartTime();
                        int endTime3 = textStickerData.getEndTime() - textStickerData.getStartTime();
                        String textStr5 = textStickerData.getTextStr();
                        o.LJI(textStr5);
                        textStickerData.setEndTime(((textStr5.length() * endTime3) / length2) + startTime2);
                        textStickerData2 = textStickerData.m110clone();
                        textStickerData2.setTextStr(substring);
                        textStickerData2.setStartTime(textStickerData2.getEndTime() + 1);
                        textStickerData2.setEndTime(endTime);
                        TextStickerTextWrap[] textStickerTextWrapArr = new TextStickerTextWrap[1];
                        Context context3 = c69p.LJLLLL;
                        if (context3 != null) {
                            textStickerTextWrapArr[0] = C68W.LIZJ(C68W.LJIILJJIL(textStickerData2, context3));
                            textStickerData2.setTextWrapList(C47261Igj.LJII(textStickerTextWrapArr));
                            int i4 = i2 + 1;
                            ListProtector.add(c69p.LJLJL, i4, textStickerData2);
                            c69p.LJLLI = i2;
                            c69p.LJLL = i4;
                            c69p.LJLLJ = 0;
                            c69p.notifyItemRangeChanged(i2, c69p.getItemCount() - i2);
                            RecyclerView recyclerView = c69p.LJLJLJ;
                            if (recyclerView != null) {
                                recyclerView.post(new ARunnableS6S0101000_2(i4, c69p, 14));
                            }
                        } else {
                            o.LJIJI("context");
                            throw null;
                        }
                    } else {
                        o.LJIJI("context");
                        throw null;
                    }
                }
                c69p.LJLJJL.gi(startTime, endTime, textStickerData, textStickerData2);
            }
        }), new C157326Fk(Integer.MAX_VALUE)});
        holder.LJLIL.addTextChangedListener(new IDObjectS119S0200000_2(this, holder, 2));
        holder.LJLIL.setSoftKeyListener(new View.OnKeyListener() { // from class: X.69Q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                TextView textView;
                int i3;
                Integer num = null;
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
                C69P c69p = C69P.this;
                Object obj = ListProtector.get(c69p.LJLJL, i);
                o.LJIIIIZZ(obj, "list[pos]");
                TextStickerData textStickerData = (TextStickerData) obj;
                int i4 = i;
                if (i4 == 0) {
                    c69p.getClass();
                } else {
                    C69T c69t = c69p.LJLJJL;
                    int i5 = i4 - 1;
                    Object obj2 = ListProtector.get(c69p.LJLJL, i5);
                    o.LJIIIIZZ(obj2, "list[pos - 1]");
                    c69t.kd((TextStickerData) obj2, textStickerData);
                    ((TextStickerData) ListProtector.get(c69p.LJLJL, i5)).setEndTime(textStickerData.getEndTime());
                    String textStr = ((TextStickerData) ListProtector.get(c69p.LJLJL, i5)).getTextStr();
                    if (textStr != null) {
                        num = Integer.valueOf(textStr.length());
                    }
                    ListProtector.get(c69p.LJLJL, i5);
                    TextStickerData textStickerData2 = (TextStickerData) ListProtector.get(c69p.LJLJL, i5);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(((TextStickerData) ListProtector.get(c69p.LJLJL, i5)).getTextStr());
                    LIZ.append(textStickerData.getTextStr());
                    textStickerData2.setTextStr(X1D.LIZIZ(LIZ));
                    ListProtector.remove(c69p.LJLJL, i4);
                    c69p.LJLL = i5;
                    o.LJI(num);
                    c69p.LJLLJ = num.intValue();
                    c69p.LJLLL = true;
                    c69p.notifyItemRemoved(i4);
                    c69p.notifyItemRangeChanged(i5, (c69p.getItemCount() - i4) + 2);
                    RecyclerView recyclerView = c69p.LJLJLJ;
                    if (recyclerView != null) {
                        recyclerView.post(new ARunnableS6S0101000_2(i4, c69p, 13));
                    }
                }
                return true;
            }
        });
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C145085mi com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        this.LJLJJLL = C1DI.LIZ(viewGroup, "parent", R.layout.cpg, viewGroup, false, "from(parent.context).inf…edit_item, parent, false)");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLLLL = context;
        View view = this.LJLJJLL;
        if (view != null) {
            C145085mi c145085mi = new C145085mi(view);
            C0AX.LIZ(viewGroup, c145085mi.itemView, R.id.lj7);
            View view2 = c145085mi.itemView;
            if (view2 != null) {
                view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
            }
            try {
                if (c145085mi.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C145085mi.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c145085mi.itemView.getParent();
                        if (viewGroup2 != null) {
                            C16880lQ.LJLLL(c145085mi.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C145085mi.class.getName();
            return c145085mi;
        }
        o.LJIJI("view");
        throw null;
    }

    public final void LJLLLLLL(C145085mi c145085mi, int i, boolean z) {
        int i2;
        if (!z) {
            c145085mi.itemView.setBackgroundResource(0);
            C6DT c6dt = c145085mi.LJLIL;
            Context context = this.LJLLLL;
            if (context != null) {
                c6dt.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> onBindViewHolder: fmc clearFocus pos ");
                LIZ.append(i);
                LIZ.append(" curFocusIndex ");
                LIZ.append(this.LJLL);
                H7B.LJ(X1D.LIZIZ(LIZ));
                c145085mi.LJLIL.clearFocus();
            } else {
                o.LJIJI("context");
                throw null;
            }
        } else {
            StringBuilder LJ = C7MY.LJ("InlineCaptionTextFragment -> CaptionEditAdapter -> onBindViewHolder: fmc requestFocus pos ", i, " curFocusIndex ");
            LJ.append(this.LJLL);
            H7B.LJ(X1D.LIZIZ(LJ));
            c145085mi.LJLIL.requestFocus();
            C6DT c6dt2 = c145085mi.LJLIL;
            Context context2 = this.LJLLLL;
            if (context2 != null) {
                c6dt2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
                View view = c145085mi.itemView;
                Context context3 = this.LJLLLL;
                if (context3 != null) {
                    view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d2, context3));
                    int i3 = this.LJLLJ;
                    if (i3 >= 0) {
                        Editable text = c145085mi.LJLIL.getText();
                        if (text != null) {
                            i2 = text.length();
                        } else {
                            i2 = 0;
                        }
                        if (i3 <= i2) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("InlineCaptionTextFragment -> CaptionEditAdapter set bind selection focusIndex ");
                            LIZ2.append(this.LJLL);
                            LIZ2.append(" selectIndex ");
                            LIZ2.append(this.LJLLJ);
                            H7B.LJ(X1D.LIZIZ(LIZ2));
                            c145085mi.LJLIL.setSelection(this.LJLLJ);
                        }
                    }
                    c145085mi.LJLIL.setOnSelectionChangedListener(new C6AH() { // from class: X.69R
                        @Override // X.C6AH
                        public final void LIZ(int i4) {
                            if (C69P.this.LJLLL) {
                                return;
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("InlineCaptionTextFragment -> CaptionEditAdapter -> onSelectionChanged selStart ");
                            LIZ3.append(i4);
                            H7B.LJ(X1D.LIZIZ(LIZ3));
                            C69P.this.LJLLJ = i4;
                        }
                    });
                    this.LJLJJL.Wa(c145085mi.LJLIL);
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            } else {
                o.LJIJI("context");
                throw null;
            }
        }
        if (this.LJLLILLLL == i) {
            if (z) {
                c145085mi.LJLILLLLZI.setVisibility(8);
                c145085mi.LJLJI.setVisibility(0);
                return;
            }
        } else if (z) {
            c145085mi.LJLILLLLZI.setVisibility(0);
            c145085mi.LJLJI.setVisibility(8);
            return;
        }
        c145085mi.LJLILLLLZI.setVisibility(8);
        c145085mi.LJLJI.setVisibility(8);
    }

    public C69P(VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext, String enterMethod, String currentLanguageCode, C69T editCaptionListener) {
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(currentLanguageCode, "currentLanguageCode");
        o.LJIIIZ(editCaptionListener, "editCaptionListener");
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = editorProContext;
        this.LJLJI = enterMethod;
        this.LJLJJI = currentLanguageCode;
        this.LJLJJL = editCaptionListener;
        this.LJLJL = new ArrayList<>();
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
        this.LJLLJ = -1;
    }
}
