package Y;

import X.C04330Ez;
import X.C116414hZ;
import X.C116724i4;
import X.C176996x5;
import X.C177336xd;
import X.C177906yY;
import X.C178166yy;
import X.C178406zM;
import X.C1794072i;
import X.C208018Ej;
import X.C224738rt;
import X.C224748ru;
import X.C55096Ljo;
import X.C73411SrX;
import X.SY4;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.NowCommentMentionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDObjectS120S0200000_3 implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                afterTextChanged$1(this, editable);
                return;
            case 2:
                afterTextChanged$2(this, editable);
                return;
            case 3:
                afterTextChanged$3(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public static final void afterTextChanged$0(IDObjectS120S0200000_3 iDObjectS120S0200000_3, Editable editable) {
        int i;
        String str;
        boolean z;
        String obj;
        if (editable != null && (obj = editable.toString()) != null) {
            i = obj.length();
        } else {
            i = 0;
        }
        EditText editText = ((InputNameSheetFragment) iDObjectS120S0200000_3.l0).LJLILLLLZI;
        if (editText != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C04330Ez.LIZIZ(editText.getContext(), R.color.q0));
            C116724i4 c116724i4 = new C116724i4();
            if (i > 30) {
                c116724i4.LIZJ(C208018Ej.LIZ(i), foregroundColorSpan);
            } else {
                c116724i4.LIZIZ(C208018Ej.LIZ(i));
            }
            c116724i4.LJ("/");
            c116724i4.LIZIZ(C208018Ej.LIZ(30));
            ((TextView) iDObjectS120S0200000_3.l1).setText(c116724i4.LIZ);
            InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) iDObjectS120S0200000_3.l0;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            ImageView imageView = inputNameSheetFragment.LJLJI;
            if (imageView != null) {
                imageView.setVisibility(0);
                C116414hZ c116414hZ = inputNameSheetFragment.LJLIL;
                if (c116414hZ != null) {
                    c116414hZ.setVisibility(8);
                    C73411SrX c73411SrX = inputNameSheetFragment.LJLJJLL;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ImageView imageView2 = inputNameSheetFragment.LJLJI;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                            TextView textView = inputNameSheetFragment.LJLJJI;
                            if (textView != null) {
                                textView.setVisibility(4);
                                SY4 sy4 = inputNameSheetFragment.LJLJJL;
                                if (sy4 != null) {
                                    sy4.setEnabled(false);
                                    return;
                                } else {
                                    o.LJIJI("submit");
                                    throw null;
                                }
                            }
                            o.LJIJI("tvEditHint");
                            throw null;
                        }
                        o.LJIJI("ivClearAll");
                        throw null;
                    }
                    if (str.length() > 30) {
                        TextView textView2 = inputNameSheetFragment.LJLJJI;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            TextView textView3 = inputNameSheetFragment.LJLJJI;
                            if (textView3 != null) {
                                textView3.setText(inputNameSheetFragment.getText(R.string.gax));
                                SY4 sy42 = inputNameSheetFragment.LJLJJL;
                                if (sy42 != null) {
                                    sy42.setEnabled(false);
                                    return;
                                } else {
                                    o.LJIJI("submit");
                                    throw null;
                                }
                            }
                            o.LJIJI("tvEditHint");
                            throw null;
                        }
                        o.LJIJI("tvEditHint");
                        throw null;
                    }
                    TextView textView4 = inputNameSheetFragment.LJLJJI;
                    if (textView4 != null) {
                        textView4.setVisibility(4);
                        SY4 sy43 = inputNameSheetFragment.LJLJJL;
                        if (sy43 != null) {
                            sy43.setEnabled(true);
                            return;
                        } else {
                            o.LJIJI("submit");
                            throw null;
                        }
                    }
                    o.LJIJI("tvEditHint");
                    throw null;
                }
                o.LJIJI("loading");
                throw null;
            }
            o.LJIJI("ivClearAll");
            throw null;
        }
        o.LJIJI("etInput");
        throw null;
    }

    public static final void afterTextChanged$1(IDObjectS120S0200000_3 iDObjectS120S0200000_3, Editable s) {
        o.LJIIIZ(s, "s");
        if (((CommentMentionAssem) iDObjectS120S0200000_3.l0).v3() && o.LJ(((CommentMentionAssem) iDObjectS120S0200000_3.l0).E3().getState().LJLJJI, C177906yY.LIZ)) {
            ((CommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LIZ(((C224748ru) iDObjectS120S0200000_3.l1).getSelectionStart(), s);
        }
    }

    public static final void afterTextChanged$2(IDObjectS120S0200000_3 iDObjectS120S0200000_3, Editable s) {
        o.LJIIIZ(s, "s");
        if (((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).v3() && o.LJ(((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).C3().getState().LJLJJI, C177906yY.LIZ)) {
            ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).LJLJJI.LIZ(((C224738rt) iDObjectS120S0200000_3.l1).getSelectionStart(), s);
        }
    }

    public static final void afterTextChanged$3(IDObjectS120S0200000_3 iDObjectS120S0200000_3, Editable s) {
        o.LJIIIZ(s, "s");
        if (((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).v3() && o.LJ(((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).C3().getState().LJLJJI, C177906yY.LIZ)) {
            ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).LJLJJI.LIZ(((C224738rt) iDObjectS120S0200000_3.l1).getSelectionStart(), s);
        }
    }

    public IDObjectS120S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void beforeTextChanged$1(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        ((CommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LIZLLL(((CommentMentionAssem) iDObjectS120S0200000_3.l0).A3());
    }

    public static final void beforeTextChanged$2(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        NowCommentMentionAssem nowCommentMentionAssem = (NowCommentMentionAssem) iDObjectS120S0200000_3.l0;
        nowCommentMentionAssem.LJLJJI.LIZLLL(nowCommentMentionAssem.A3());
    }

    public static final void beforeTextChanged$3(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        NowCommentMentionAssem nowCommentMentionAssem = (NowCommentMentionAssem) iDObjectS120S0200000_3.l0;
        nowCommentMentionAssem.LJLJJI.LIZLLL(nowCommentMentionAssem.A3());
    }

    public static final void onTextChanged$1(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence s, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        String str4;
        Aweme aweme;
        NowPostInfo nowPostInfo;
        Aweme aweme2;
        Aweme aweme3;
        C176996x5 EJ;
        o.LJIIIZ(s, "s");
        CommentMentionAssem commentMentionAssem = (CommentMentionAssem) iDObjectS120S0200000_3.l0;
        if (!commentMentionAssem.LJLJJL) {
            return;
        }
        if (!commentMentionAssem.H3()) {
            KeyboardVMV2 E3 = ((CommentMentionAssem) iDObjectS120S0200000_3.l0).E3();
            E3.getClass();
            E3.setState(new AqS8S0010000_3(true, 22));
        }
        if (!TextUtils.isEmpty(s) && i3 > 0) {
            if ('@' == s.toString().charAt((i + i3) - 1) && ((CommentMentionAssem) iDObjectS120S0200000_3.l0).v3()) {
                ((CommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LIZJ(true);
                CommentMentionAssem commentMentionAssem2 = (CommentMentionAssem) iDObjectS120S0200000_3.l0;
                if (commentMentionAssem2.LJLIL) {
                    str = "button";
                } else {
                    str = "input";
                }
                IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ(commentMentionAssem2));
                String str5 = null;
                if (LIZ != null && (EJ = LIZ.EJ()) != null) {
                    EJ.LJJIL(str);
                }
                C177336xd C3 = ((CommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
                if (C3 != null) {
                    str2 = C3.LJLJJLL;
                } else {
                    str2 = null;
                }
                C177336xd C32 = ((CommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
                if (C32 != null && (aweme3 = C32.LJLLI) != null) {
                    str3 = aweme3.getAid();
                } else {
                    str3 = null;
                }
                C177336xd C33 = ((CommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
                if (C33 != null && (aweme2 = C33.LJLLI) != null) {
                    str5 = aweme2.getAuthorUid();
                }
                C177336xd C34 = ((CommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
                if (C34 == null || (aweme = C34.LJLLI) == null || (nowPostInfo = aweme.nowPostInfo) == null || (str4 = nowPostInfo.getNowMediaType()) == null) {
                    str4 = "";
                }
                C1794072i.LJI(str2, str, str3, str5, str4);
                ((CommentMentionAssem) iDObjectS120S0200000_3.l0).LJLIL = false;
                return;
            }
            if (!((CommentMentionAssem) iDObjectS120S0200000_3.l0).H3()) {
                return;
            }
            KeyboardVMV2 E32 = ((CommentMentionAssem) iDObjectS120S0200000_3.l0).E3();
            E32.getClass();
            E32.setState(new AqS8S0010000_3(false, 22));
        }
    }

    public static final void onTextChanged$2(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence s, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        String str4;
        NowPostInfo nowPostInfo;
        o.LJIIIZ(s, "s");
        if (!((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).F3()) {
            NowKeyboardVM C3 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
            C3.getClass();
            C3.setState(new AqS8S0010000_3(true, 7));
        }
        if (!TextUtils.isEmpty(s) && i3 > 0) {
            if ('@' == s.toString().charAt((i + i3) - 1) && ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).v3()) {
                ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).LJLJJI.LIZJ(true);
                NowCommentMentionAssem nowCommentMentionAssem = (NowCommentMentionAssem) iDObjectS120S0200000_3.l0;
                if (nowCommentMentionAssem.LJLILLLLZI) {
                    str = "button";
                } else {
                    str = "input";
                }
                NowFeedMobHierarchyData nowFeedMobHierarchyData = nowCommentMentionAssem.x3().LJLJJL;
                String str5 = null;
                if (nowFeedMobHierarchyData != null) {
                    str2 = nowFeedMobHierarchyData.getEnterFrom();
                } else {
                    str2 = null;
                }
                Aweme aweme = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LJLIL;
                if (aweme != null) {
                    str3 = aweme.getAid();
                } else {
                    str3 = null;
                }
                Aweme aweme2 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LJLIL;
                if (aweme2 != null) {
                    str5 = aweme2.getAuthorUid();
                }
                Aweme aweme3 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LJLIL;
                if (aweme3 == null || (nowPostInfo = aweme3.nowPostInfo) == null || (str4 = nowPostInfo.getNowMediaType()) == null) {
                    str4 = "";
                }
                C1794072i.LJI(str2, str, str3, str5, str4);
                ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).LJLILLLLZI = false;
                return;
            }
            if (!((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).F3()) {
                return;
            }
            NowKeyboardVM C32 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
            C32.getClass();
            C32.setState(new AqS8S0010000_3(false, 7));
        }
    }

    public static final void onTextChanged$3(IDObjectS120S0200000_3 iDObjectS120S0200000_3, CharSequence s, int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(s, "s");
        if (!((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).F3()) {
            NowKeyboardVM C3 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
            C3.getClass();
            C3.setState(new AqS8S0010000_3(true, 7));
        }
        if (!TextUtils.isEmpty(s) && i3 > 0) {
            if ('@' == s.toString().charAt((i + i3) - 1) && ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).v3()) {
                ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).LJLJJI.LIZJ(true);
                NowCommentMentionAssem nowCommentMentionAssem = (NowCommentMentionAssem) iDObjectS120S0200000_3.l0;
                if (nowCommentMentionAssem.LJLILLLLZI) {
                    str = "button";
                } else {
                    str = "input";
                }
                NowFeedMobHierarchyData nowFeedMobHierarchyData = nowCommentMentionAssem.x3().LJLJJL;
                String str4 = null;
                if (nowFeedMobHierarchyData != null) {
                    str2 = nowFeedMobHierarchyData.getEnterFrom();
                } else {
                    str2 = null;
                }
                Aweme aweme = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LJLIL;
                if (aweme != null) {
                    str3 = aweme.getAid();
                } else {
                    str3 = null;
                }
                Aweme aweme2 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LJLIL;
                if (aweme2 != null) {
                    str4 = aweme2.getAuthorUid();
                }
                C1794072i.LJI(str2, str, str3, str4, C178406zM.LJIIIZ(((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).x3().LJLIL));
                ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).LJLILLLLZI = false;
                return;
            }
            if (!((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).F3()) {
                return;
            }
            NowKeyboardVM C32 = ((NowCommentMentionAssem) iDObjectS120S0200000_3.l0).C3();
            C32.getClass();
            C32.setState(new AqS8S0010000_3(false, 7));
        }
    }
}
