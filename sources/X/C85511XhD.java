package X;

import Y.ACListenerS30S0201000_15;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS35S0100000_15;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XhD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85511XhD extends AbstractC029409q<C85513XhF> {
    public final CreatorCaptionEditViewModel LJLIL;
    public final InterfaceC85514XhG LJLILLLLZI;
    public View LJLJI;
    public int LJLJJI;
    public View LJLJJL;
    public int LJLJJLL;
    public RecyclerView LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    public final void LJLZ() {
        RecyclerView.ViewHolder LJJIZ;
        RecyclerView recyclerView = this.LJLJL;
        if (recyclerView != null && (LJJIZ = recyclerView.LJJIZ(this.LJLJJLL)) != null) {
            C85513XhF c85513XhF = (C85513XhF) LJJIZ;
            if (c85513XhF.LJLJJI.getVisibility() == 0) {
                c85513XhF.LJLJJI.pauseAnimation();
                c85513XhF.LJLJJI.setVisibility(8);
                c85513XhF.LJLJJL.setVisibility(0);
            }
        }
    }

    public final void LJZ() {
        RecyclerView.ViewHolder LJJIZ;
        View view = this.LJLJJL;
        if (view != null) {
            KeyboardUtils.LIZIZ(view);
            view.clearFocus();
        }
        RecyclerView recyclerView = this.LJLJL;
        if (recyclerView != null && (LJJIZ = recyclerView.LJJIZ(this.LJLJJLL)) != null) {
            C85513XhF c85513XhF = (C85513XhF) LJJIZ;
            c85513XhF.LJLJJI.pauseAnimation();
            c85513XhF.LJLJJI.setVisibility(8);
            c85513XhF.LJLJJL.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<CreatorCaptionEditData> transSubtitleItem;
        CreatorCaptionEditItem creatorCaptionEditItem = this.LJLIL.LJLJJLL;
        if (creatorCaptionEditItem != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null) {
            return transSubtitleItem.size();
        }
        return 0;
    }

    public final void LJLLLLLL(int i) {
        RecyclerView.ViewHolder LJJIZ;
        RecyclerView.ViewHolder LJJIZ2;
        if (i == -1 || i == this.LJLJJI) {
            return;
        }
        this.LJLJJI = i;
        C118234kV it = C78842Uww.LJJ(0, getItemCount()).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            RecyclerView recyclerView = this.LJLJL;
            if (recyclerView != null && (LJJIZ2 = recyclerView.LJJIZ(nextInt)) != null) {
                C85513XhF c85513XhF = (C85513XhF) LJJIZ2;
                c85513XhF.LJLIL.setTextColor(EF7.LIZIZ().getResources().getColor(R.color.bg));
                c85513XhF.LJLJJI.pauseAnimation();
                c85513XhF.LJLJJI.setVisibility(8);
                c85513XhF.LJLJJL.setVisibility(8);
            }
        }
        RecyclerView recyclerView2 = this.LJLJL;
        if (recyclerView2 == null || (LJJIZ = recyclerView2.LJJIZ(i)) == null) {
            return;
        }
        ((C85513XhF) LJJIZ).LJLIL.setTextColor(EF7.LIZIZ().getResources().getColor(R.color.bc));
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView rv) {
        o.LJIIIZ(rv, "rv");
        super.onAttachedToRecyclerView(rv);
        this.LJLJL = rv;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C85513XhF c85513XhF) {
        C85513XhF holder = c85513XhF;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.LJLJLJ && holder.LJLIL.getText().toString().length() == 0) {
            holder.LJLIL.requestFocus();
            holder.LJLIL.callOnClick();
            this.LJLJLJ = false;
        }
    }

    public C85511XhD(CreatorCaptionEditViewModel editViewModel, InterfaceC85514XhG itemListener) {
        o.LJIIIZ(editViewModel, "editViewModel");
        o.LJIIIZ(itemListener, "itemListener");
        this.LJLIL = editViewModel;
        this.LJLILLLLZI = itemListener;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C85513XhF c85513XhF, int i) {
        boolean z;
        String str;
        Number number;
        String str2;
        CreatorCaptionEditData creatorCaptionEditData;
        CaptionItemModel LJIIIIZZ;
        C85513XhF holder = c85513XhF;
        o.LJIIIZ(holder, "holder");
        CreatorCaptionEditItem creatorCaptionEditItem = this.LJLIL.LJLJJLL;
        if (creatorCaptionEditItem != null) {
            int i2 = 0;
            if (this.LJLJJI == i) {
                z = true;
            } else {
                z = false;
            }
            int i3 = R.color.bc;
            if (z) {
                holder.LJLIL.setTextColor(EF7.LIZIZ().getResources().getColor(R.color.bc));
            } else {
                holder.LJLIL.setTextColor(EF7.LIZIZ().getResources().getColor(R.color.bg));
            }
            holder.LJLIL.setVisibility(0);
            EditText editText = holder.LJLIL;
            if (editText != null) {
                editText.setTypeface(null, 1);
            }
            holder.LJLIL.addTextChangedListener(new TextWatcher() { // from class: X.72N
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence s, int i4, int i5, int i6) {
                    o.LJIIIZ(s, "s");
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence s, int i4, int i5, int i6) {
                    o.LJIIIZ(s, "s");
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable s) {
                    o.LJIIIZ(s, "s");
                    for (int length = s.length() - 1; -1 < length; length--) {
                        if (s.charAt(length) == '\n' || s.charAt(length) == '\r') {
                            s.delete(length, length + 1);
                            return;
                        }
                    }
                }
            });
            Aweme value = this.LJLIL.gv0().getValue();
            if (value != null && (LJIIIIZZ = C86670Xzu.LJIIIIZZ(value)) != null) {
                str = LJIIIIZZ.getLanguageCode();
            } else {
                str = null;
            }
            C53076KsK.LIZ.getClass();
            java.util.Map map = (java.util.Map) SettingsManager.LIZLLL().LJIIIIZZ("cec_max_num_lines", HashMap.class, null);
            if (map == null || (number = (Number) map.get(str)) == null) {
                number = 105;
            }
            holder.LJLIL.setFilters(new InputFilter[]{new InputFilter.LengthFilter(number.intValue())});
            EditText editText2 = holder.LJLIL;
            List<CreatorCaptionEditData> transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem();
            if (transSubtitleItem == null || (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(transSubtitleItem, i)) == null || (str2 = creatorCaptionEditData.getText()) == null) {
                str2 = "";
            }
            editText2.setText(str2);
            holder.LJLIL.addTextChangedListener(new C85508XhA(creatorCaptionEditItem, i, holder, this));
            holder.setIsRecyclable(false);
            C29701Eo c29701Eo = holder.LJLJJI;
            c29701Eo.setAnimation("little_audio_wave_anim.json");
            c29701Eo.setRepeatCount(-1);
            holder.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0201000_15(i, holder, this, 0)));
            holder.LJLIL.setClickable(this.LJLJLLL);
            holder.LJLIL.setEnabled(this.LJLJLLL);
            holder.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0101000_15(i, this, 7)));
            View view = holder.LJLILLLLZI;
            if (this.LJLJLLL) {
                i2 = 8;
            }
            view.setVisibility(i2);
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 238), holder.LJLILLLLZI);
            EditText editText3 = holder.LJLIL;
            Resources resources = EF7.LIZIZ().getResources();
            if (i != this.LJLJJI) {
                i3 = R.color.bg;
            }
            editText3.setTextColor(resources.getColor(i3));
            holder.LJLJJI.pauseAnimation();
            holder.LJLJJI.setVisibility(8);
            holder.LJLJJL.setVisibility(8);
            holder.LJLIL.setOnFocusChangeListener(new ViewOnFocusChangeListenerC85512XhE(i, holder, this));
            C16880lQ.LJIILLIIL(holder.LJLJJL, new ACListenerS30S0201000_15(i, holder, this, 1));
        }
    }

    @Override // X.AbstractC029409q
    public final C85513XhF onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.LJLJI = C1DI.LIZ(viewGroup, "parent", R.layout.aaf, viewGroup, false, "from(parent.context)\n   …edit_item, parent, false)");
        View view = this.LJLJI;
        if (view != null) {
            C85513XhF c85513XhF = new C85513XhF(view);
            C0AX.LIZ(viewGroup, c85513XhF.itemView, R.id.lj7);
            View view2 = c85513XhF.itemView;
            if (view2 != null) {
                view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
            }
            try {
                if (c85513XhF.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C85513XhF.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c85513XhF.itemView.getParent();
                        if (viewGroup2 != null) {
                            C16880lQ.LJLLL(c85513XhF.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C85513XhF.class.getName();
            return c85513XhF;
        }
        o.LJIJI("contentView");
        throw null;
    }
}
