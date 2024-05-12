package Y;

import X.AbstractC73672Svk;
import X.BEC;
import X.BI8;
import X.BZI;
import X.C0K5;
import X.C0NB;
import X.C0Y4;
import X.C15380j0;
import X.C19K;
import X.C1EW;
import X.C238749Yo;
import X.C28787BRn;
import X.C28874BUw;
import X.C29137Bc5;
import X.C29306Beo;
import X.C2NU;
import X.C30868C9o;
import X.C30922CBq;
import X.C31540CZk;
import X.C31546CZq;
import X.C47121t6;
import X.C51029K0z;
import X.C78934UyQ;
import X.CVL;
import X.EnumC31545CZp;
import X.FP1;
import X.OJD;
import X.Q7L;
import X.X1D;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewLiveDetailSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragmentSheet;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.bytedance.android.livesdk.giftlimitnotification.LiveGiftReminderAmountKeyboardFragment;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LivesdkPreviewCoverFixCombineSetting;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastGameTagOpSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.moderator.AddModeratorFragmentSheet;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public class IDObjectS178S0100000_5 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$10(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$11(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$12(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$10(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$11(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
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
            case 4:
                afterTextChanged$4(this, editable);
                return;
            case 5:
                afterTextChanged$5(this, editable);
                return;
            case 6:
                afterTextChanged$6(this, editable);
                return;
            case 7:
                afterTextChanged$7(this, editable);
                return;
            case 8:
                afterTextChanged$8(this, editable);
                return;
            case 9:
                afterTextChanged$9(this, editable);
                return;
            case 10:
                afterTextChanged$10(this, editable);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                afterTextChanged$11(this, editable);
                return;
            case 12:
                afterTextChanged$12(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(charSequence, "s");
                return;
            case 1:
                o.LJIIIZ(charSequence, "s");
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            case 3:
                o.LJIIIZ(charSequence, "s");
                return;
            case 4:
                o.LJIIIZ(charSequence, "s");
                return;
            case 5:
                o.LJIIIZ(charSequence, "s");
                return;
            case 6:
                o.LJIIIZ(charSequence, "s");
                return;
            case 7:
                o.LJIIIZ(charSequence, "s");
                return;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                return;
            case 9:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                return;
            case 10:
                beforeTextChanged$10(this, charSequence, i, i2, i3);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                beforeTextChanged$11(this, charSequence, i, i2, i3);
                return;
            case 12:
                beforeTextChanged$12(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(charSequence, "s");
                return;
            case 1:
                o.LJIIIZ(charSequence, "s");
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            case 3:
                o.LJIIIZ(charSequence, "s");
                return;
            case 4:
                o.LJIIIZ(charSequence, "s");
                return;
            case 5:
                o.LJIIIZ(charSequence, "s");
                return;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                return;
            case 7:
                o.LJIIIZ(charSequence, "s");
                return;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                return;
            case 9:
                onTextChanged$9(this, charSequence, i, i2, i3);
                return;
            case 10:
                onTextChanged$10(this, charSequence, i, i2, i3);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onTextChanged$11(this, charSequence, i, i2, i3);
                return;
            case 12:
                onTextChanged$12(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public final void LIZIZ$1(boolean z) {
        if (z) {
            View _$_findCachedViewById = ((GameCategoryListFragment) this.l0)._$_findCachedViewById(R.id.g5w);
            if (_$_findCachedViewById == null) {
                return;
            }
            _$_findCachedViewById.setVisibility(0);
            return;
        }
        View _$_findCachedViewById2 = ((GameCategoryListFragment) this.l0)._$_findCachedViewById(R.id.g5w);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setVisibility(8);
    }

    public IDObjectS178S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        String str;
        o.LJIIIZ(s, "s");
        PreviewLiveDetailWidget previewLiveDetailWidget = (PreviewLiveDetailWidget) iDObjectS178S0100000_5.l0;
        LiveEditText liveEditText = previewLiveDetailWidget.LJLJJI;
        if (liveEditText != null) {
            Editable text = liveEditText.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (TextUtils.getTrimmedLength(str) > 32) {
                LiveEditText liveEditText2 = previewLiveDetailWidget.LJLJJI;
                if (liveEditText2 != null) {
                    liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(str.length())});
                    String LJIILL = C15380j0.LJIILL(R.string.srg, 32);
                    o.LJIIIIZZ(LJIILL, "getString(R.string.ttliv… ROOM_TITLE_LENGTH_LIMIT)");
                    C30868C9o.LJI(LJIILL);
                    String substring = str.substring(0, 32);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    previewLiveDetailWidget.LLFF(substring);
                    LiveEditText liveEditText3 = previewLiveDetailWidget.LJLJJI;
                    if (liveEditText3 != null) {
                        liveEditText3.setSelection(substring.length());
                        return;
                    } else {
                        o.LJIJI("mTitleView");
                        throw null;
                    }
                }
                o.LJIJI("mTitleView");
                throw null;
            }
            LiveEditText liveEditText4 = previewLiveDetailWidget.LJLJJI;
            if (liveEditText4 != null) {
                liveEditText4.setFilters(new InputFilter[0]);
                return;
            } else {
                o.LJIJI("mTitleView");
                throw null;
            }
        }
        o.LJIJI("mTitleView");
        throw null;
    }

    public static final void afterTextChanged$1(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        String str;
        LiveMode liveMode;
        Map map;
        o.LJIIIZ(s, "s");
        PreviewTitleWidget previewTitleWidget = (PreviewTitleWidget) iDObjectS178S0100000_5.l0;
        LiveEditText liveEditText = previewTitleWidget.LJLJJI;
        if (liveEditText != null) {
            Editable text = liveEditText.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (TextUtils.getTrimmedLength(str) > 32) {
                LiveEditText liveEditText2 = previewTitleWidget.LJLJJI;
                if (liveEditText2 != null) {
                    liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(str.length())});
                    String LJIILL = C15380j0.LJIILL(R.string.srg, 32);
                    o.LJIIIIZZ(LJIILL, "getString(R.string.ttliv… ROOM_TITLE_LENGTH_LIMIT)");
                    C30868C9o.LJI(LJIILL);
                    String substring = str.substring(0, 32);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    previewTitleWidget.LLFF(substring);
                    LiveEditText liveEditText3 = previewTitleWidget.LJLJJI;
                    if (liveEditText3 != null) {
                        liveEditText3.setSelection(substring.length());
                    } else {
                        o.LJIJI("mTitleView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mTitleView");
                    throw null;
                }
            } else {
                LiveEditText liveEditText4 = previewTitleWidget.LJLJJI;
                if (liveEditText4 != null) {
                    liveEditText4.setFilters(new InputFilter[0]);
                } else {
                    o.LJIJI("mTitleView");
                    throw null;
                }
            }
            if (LivesdkPreviewCoverFixCombineSetting.INSTANCE.getValue()) {
                DataChannel dataChannel = ((PreviewTitleWidget) iDObjectS178S0100000_5.l0).dataChannel;
                if (dataChannel == null || (liveMode = C78934UyQ.LJIL(dataChannel)) == null) {
                    liveMode = LiveMode.VIDEO;
                }
                DataChannel dataChannel2 = ((PreviewTitleWidget) iDObjectS178S0100000_5.l0).dataChannel;
                if (dataChannel2 != null && (map = (Map) dataChannel2.kv0(PreviewLiveModeTitleChannel.class)) != null) {
                    LiveEditText liveEditText5 = ((PreviewTitleWidget) iDObjectS178S0100000_5.l0).LJLJJI;
                    if (liveEditText5 != null) {
                        map.put(liveMode, s.LJJZZIII(" ", String.valueOf(liveEditText5.getText())));
                    } else {
                        o.LJIJI("mTitleView");
                        throw null;
                    }
                }
            }
            PreviewTitleWidget previewTitleWidget2 = (PreviewTitleWidget) iDObjectS178S0100000_5.l0;
            DataChannel dataChannel3 = previewTitleWidget2.dataChannel;
            if (dataChannel3 != null) {
                LiveEditText liveEditText6 = previewTitleWidget2.LJLJJI;
                if (liveEditText6 != null) {
                    dataChannel3.rv0(PreviewTitleChannel.class, s.LJJZZIII(" ", String.valueOf(liveEditText6.getText())));
                    return;
                } else {
                    o.LJIJI("mTitleView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mTitleView");
        throw null;
    }

    public static final void afterTextChanged$10(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable editable) {
        String str;
        if (!((AddModeratorFragment) iDObjectS178S0100000_5.l0).isViewValid()) {
            return;
        }
        AddModeratorFragment addModeratorFragment = (AddModeratorFragment) iDObjectS178S0100000_5.l0;
        C238749Yo c238749Yo = addModeratorFragment.LJLIL;
        if (c238749Yo != null) {
            Editable text = ((C19K) addModeratorFragment._$_findCachedViewById(R.id.jf4)).getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            c238749Yo.LJLLLLLL(str);
        }
        if (C29306Beo.LJIJJLI(((C19K) ((AddModeratorFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.jf4)).getText())) {
            C29306Beo.LJJLJLI(((AddModeratorFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.jg9));
        } else {
            C29306Beo.LJI(((AddModeratorFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.jg9));
        }
    }

    public static final void afterTextChanged$11(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable editable) {
        if (((AddModeratorFragmentSheet) iDObjectS178S0100000_5.l0).getView() == null) {
            return;
        }
        ((AddModeratorFragmentSheet) iDObjectS178S0100000_5.l0).Ol();
        if (C29306Beo.LJIJJLI(((C19K) ((AddModeratorFragmentSheet) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.jf4)).getText())) {
            C29306Beo.LJJLJLI(((AddModeratorFragmentSheet) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.jg9));
        } else {
            C29306Beo.LJI(((AddModeratorFragmentSheet) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.jg9));
        }
    }

    public static final void afterTextChanged$12(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable editable) {
        int i;
        int i2;
        EnumC31545CZp enumC31545CZp;
        int i3;
        String obj;
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        if (editable != null) {
            StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) iDObjectS178S0100000_5.l0;
            if (s.LJJJLZIJ(editable.toString(), "\n", false)) {
                obj = ujb.o.LJJJJZ(editable.toString(), "\n", " ", false);
            } else {
                obj = editable.toString();
            }
            starCommentPaymentDialog.LJLJJL = obj;
        }
        if (s.LJJJLZIJ(String.valueOf(editable), "\n", false)) {
            return;
        }
        StarCommentPaymentDialog starCommentPaymentDialog2 = (StarCommentPaymentDialog) iDObjectS178S0100000_5.l0;
        if (i > starCommentPaymentDialog2.LJLLLLLL) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-65536);
            LiveEditText liveEditText = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText != null) {
                i3 = liveEditText.getSelectionStart();
            } else {
                i3 = 0;
            }
            if (editable != null) {
                editable.clearSpans();
            }
            if (editable != null) {
                editable.setSpan(foregroundColorSpan, ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL, i, 33);
            }
            LiveEditText liveEditText2 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText2 != null) {
                liveEditText2.removeTextChangedListener(iDObjectS178S0100000_5);
            }
            LiveEditText liveEditText3 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText3 != null) {
                liveEditText3.setText(editable);
            }
            LiveEditText liveEditText4 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText4 != null) {
                liveEditText4.setSelection(i3);
            }
            LiveEditText liveEditText5 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText5 != null) {
                liveEditText5.addTextChangedListener(iDObjectS178S0100000_5);
            }
            if (C15380j0.LJIIZILJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL);
                LIZ.append('/');
                LIZ.append(i);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ));
                spannableStringBuilder.setSpan(foregroundColorSpan, String.valueOf(((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL).length() + 1, String.valueOf(i).length() + String.valueOf(((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL).length() + 1, 33);
                C47121t6 c47121t6 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LLFFF;
                if (c47121t6 != null) {
                    c47121t6.setText(spannableStringBuilder);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(i);
                LIZ2.append('/');
                LIZ2.append(((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(X1D.LIZIZ(LIZ2));
                spannableStringBuilder2.setSpan(foregroundColorSpan, 0, String.valueOf(i).length(), 33);
                C47121t6 c47121t62 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LLFFF;
                if (c47121t62 != null) {
                    c47121t62.setText(spannableStringBuilder2);
                }
            }
        } else {
            LiveEditText liveEditText6 = starCommentPaymentDialog2.LJLLL;
            if (liveEditText6 != null) {
                i2 = liveEditText6.getSelectionStart();
            } else {
                i2 = 0;
            }
            LiveEditText liveEditText7 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText7 != null) {
                liveEditText7.removeTextChangedListener(iDObjectS178S0100000_5);
            }
            if (editable != null) {
                editable.clearSpans();
            }
            LiveEditText liveEditText8 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText8 != null) {
                liveEditText8.setText(editable);
            }
            LiveEditText liveEditText9 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText9 != null) {
                liveEditText9.setSelection(i2);
            }
            LiveEditText liveEditText10 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText10 != null) {
                liveEditText10.addTextChangedListener(iDObjectS178S0100000_5);
            }
            if (C15380j0.LJIIZILJ()) {
                C47121t6 c47121t63 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LLFFF;
                if (c47121t63 != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL);
                    LIZ3.append('/');
                    LIZ3.append(i);
                    c47121t63.setText(X1D.LIZIZ(LIZ3));
                }
            } else {
                C47121t6 c47121t64 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LLFFF;
                if (c47121t64 != null) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(i);
                    LIZ4.append('/');
                    LIZ4.append(((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLLLLL);
                    c47121t64.setText(X1D.LIZIZ(LIZ4));
                }
            }
        }
        View view = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLZ;
        if (view != null && view.getVisibility() == 0) {
            ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).vl(false);
        }
        if (!((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LLFII) {
            long currentTimeMillis = System.currentTimeMillis();
            StarCommentPaymentDialog starCommentPaymentDialog3 = (StarCommentPaymentDialog) iDObjectS178S0100000_5.l0;
            if (currentTimeMillis - starCommentPaymentDialog3.LLFF > 5000) {
                starCommentPaymentDialog3.LLFII = true;
                String str = starCommentPaymentDialog3.LLIIIJ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                C31540CZk c31540CZk = starCommentPaymentDialog3.LJLJJI;
                if (c31540CZk != null && (enumC31545CZp = c31540CZk.LJ) != null) {
                    int i4 = C31546CZq.LIZ[enumC31545CZp.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            str2 = "up_grade";
                        }
                    } else {
                        str2 = "basic";
                    }
                }
                BZI LIZ5 = C28787BRn.LIZ("livesdk_star_comment_typing");
                LIZ5.LJIIZILJ();
                LIZ5.LJIJJ(str, "enter_from");
                LIZ5.LJIJJ(str2, "gear_type");
                CVL.LIZ(LIZ5);
                LIZ5.LJJIIJZLJL();
            }
        }
        ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).Kl();
    }

    public static final void afterTextChanged$2(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        String str;
        Editable text;
        o.LJIIIZ(s, "s");
        PreviewLiveDetailSheet previewLiveDetailSheet = (PreviewLiveDetailSheet) iDObjectS178S0100000_5.l0;
        LiveEditText liveEditText = previewLiveDetailSheet.LLFF;
        if (liveEditText == null || (text = liveEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (TextUtils.getTrimmedLength(str) > 32) {
            LiveEditText liveEditText2 = previewLiveDetailSheet.LLFF;
            if (liveEditText2 != null) {
                liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(str.length())});
            }
            String LJIILL = C15380j0.LJIILL(R.string.srg, 32);
            o.LJIIIIZZ(LJIILL, "getString(R.string.ttliv…ENGTH_LIMIT\n            )");
            C30868C9o.LJI(LJIILL);
            String substring = str.substring(0, 32);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            previewLiveDetailSheet.Nl(substring);
            LiveEditText liveEditText3 = previewLiveDetailSheet.LLFF;
            if (liveEditText3 != null) {
                liveEditText3.setSelection(substring.length());
                return;
            }
            return;
        }
        LiveEditText liveEditText4 = previewLiveDetailSheet.LLFF;
        if (liveEditText4 == null) {
            return;
        }
        liveEditText4.setFilters(new InputFilter[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.String, O] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$3(Y.IDObjectS178S0100000_5 r11, android.text.Editable r12) {
        /*
            java.lang.String r0 = "s"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.lang.Object r5 = r11.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment r5 = (com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment) r5
            com.bytedance.android.live.design.widget.LiveEditText r0 = r5.LJLJI
            r10 = 0
            java.lang.String r9 = "titleView"
            if (r0 == 0) goto Lba
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L1c
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L1e
        L1c:
            java.lang.String r4 = ""
        L1e:
            int r0 = android.text.TextUtils.getTrimmedLength(r4)
            r8 = 32
            r7 = 0
            if (r0 <= r8) goto L90
            com.bytedance.android.live.design.widget.LiveEditText r6 = r5.LJLJI
            if (r6 == 0) goto Lb2
            r3 = 1
            android.text.InputFilter[] r2 = new android.text.InputFilter[r3]
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            int r0 = r4.length()
            r1.<init>(r0)
            r2[r7] = r1
            r6.setFilters(r2)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r7] = r0
            r0 = 2131847381(0x7f1168d5, float:1.9328238E38)
            java.lang.String r1 = X.C15380j0.LJIILL(r0, r1)
            java.lang.String r0 = "getString(R.string.ttliv…ENGTH_LIMIT\n            )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C30868C9o.LJI(r1)
            java.lang.String r2 = r4.substring(r7, r8)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r5.vl(r2)
            com.bytedance.android.live.design.widget.LiveEditText r1 = r5.LJLJI
            if (r1 == 0) goto Lae
            int r0 = r2.length()
            r1.setSelection(r0)
        L6a:
            java.lang.Object r0 = r11.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = X.C51029K0z.LJIILIIL(r0)
            if (r3 == 0) goto L8f
            java.lang.Class<com.bytedance.android.livesdk.broadcast.PreviewTitleChannel> r2 = com.bytedance.android.livesdk.broadcast.PreviewTitleChannel.class
            java.lang.Object r0 = r11.l0
            com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment) r0
            com.bytedance.android.live.design.widget.LiveEditText r0 = r0.LJLJI
            if (r0 == 0) goto Laa
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = " "
            java.lang.String r0 = ujb.s.LJJZZIII(r0, r1)
            r3.rv0(r2, r0)
        L8f:
            return
        L90:
            com.bytedance.android.live.design.widget.LiveEditText r1 = r5.LJLJI
            if (r1 == 0) goto Lb6
            android.text.InputFilter[] r0 = new android.text.InputFilter[r7]
            r1.setFilters(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C51029K0z.LJIILIIL(r5)
            if (r1 == 0) goto L6a
            java.lang.Class<X.BGP> r0 = X.BGP.class
            X.Cps r0 = r1.gv0(r0)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r4
            goto L6a
        Laa:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r10
        Lae:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r10
        Lb2:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r10
        Lb6:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r10
        Lba:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDObjectS178S0100000_5.afterTextChanged$3(Y.IDObjectS178S0100000_5, android.text.Editable):void");
    }

    public static final void afterTextChanged$4(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        String str;
        o.LJIIIZ(s, "s");
        PreviewTitleCoverFragmentSheet previewTitleCoverFragmentSheet = (PreviewTitleCoverFragmentSheet) iDObjectS178S0100000_5.l0;
        LiveEditText liveEditText = previewTitleCoverFragmentSheet.LLF;
        if (liveEditText != null) {
            Editable text = liveEditText.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (TextUtils.getTrimmedLength(str) > 32) {
                LiveEditText liveEditText2 = previewTitleCoverFragmentSheet.LLF;
                if (liveEditText2 != null) {
                    liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(str.length())});
                    String LJIILL = C15380j0.LJIILL(R.string.srg, 32);
                    o.LJIIIIZZ(LJIILL, "getString(R.string.ttliv…ENGTH_LIMIT\n            )");
                    C30868C9o.LJI(LJIILL);
                    String substring = str.substring(0, 32);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    previewTitleCoverFragmentSheet.Ml(substring);
                    LiveEditText liveEditText3 = previewTitleCoverFragmentSheet.LLF;
                    if (liveEditText3 != null) {
                        liveEditText3.setSelection(substring.length());
                    } else {
                        o.LJIJI("titleView");
                        throw null;
                    }
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            } else {
                LiveEditText liveEditText4 = previewTitleCoverFragmentSheet.LLF;
                if (liveEditText4 != null) {
                    liveEditText4.setFilters(new InputFilter[0]);
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((PreviewTitleCoverFragmentSheet) iDObjectS178S0100000_5.l0);
            if (LJIILIIL != null) {
                LiveEditText liveEditText5 = ((PreviewTitleCoverFragmentSheet) iDObjectS178S0100000_5.l0).LLF;
                if (liveEditText5 != null) {
                    LJIILIIL.rv0(PreviewTitleChannel.class, s.LJJZZIII(" ", String.valueOf(liveEditText5.getText())));
                    return;
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("titleView");
        throw null;
    }

    public static final void afterTextChanged$5(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        String str;
        boolean z;
        o.LJIIIZ(s, "s");
        PaidRoomCheckDialog paidRoomCheckDialog = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
        if (!paidRoomCheckDialog.isViewValid) {
            return;
        }
        Editable text = ((C19K) paidRoomCheckDialog._$_findCachedViewById(R.id.cq8)).getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        paidRoomCheckDialog.mInput = str;
        PaidRoomCheckDialog paidRoomCheckDialog2 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
        paidRoomCheckDialog2.counts = paidRoomCheckDialog2.mInput.length();
        View _$_findCachedViewById = ((PaidRoomCheckDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.kpn);
        PaidRoomCheckDialog paidRoomCheckDialog3 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
        if (!paidRoomCheckDialog3.mIsHide && paidRoomCheckDialog3.counts >= 4) {
            z = true;
        } else {
            z = false;
        }
        _$_findCachedViewById.setEnabled(z);
        PaidRoomCheckDialog paidRoomCheckDialog4 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
        if (paidRoomCheckDialog4.counts > 32) {
            String substring = paidRoomCheckDialog4.mInput.substring(0, 32);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ((TextView) ((PaidRoomCheckDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.cq8)).setText(substring);
            PaidRoomCheckDialog paidRoomCheckDialog5 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
            paidRoomCheckDialog5.counts = 32;
            ((EditText) paidRoomCheckDialog5._$_findCachedViewById(R.id.cq8)).setSelection(32);
            PaidRoomCheckDialog paidRoomCheckDialog6 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
            EditText edit_view = (EditText) paidRoomCheckDialog6._$_findCachedViewById(R.id.cq8);
            o.LJIIIIZZ(edit_view, "edit_view");
            paidRoomCheckDialog6.setCharLimit(edit_view, 32);
            ((PaidRoomCheckDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ngw).setVisibility(0);
        } else {
            paidRoomCheckDialog4._$_findCachedViewById(R.id.ngw).setVisibility(8);
            PaidRoomCheckDialog paidRoomCheckDialog7 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
            EditText edit_view2 = (EditText) paidRoomCheckDialog7._$_findCachedViewById(R.id.cq8);
            o.LJIIIIZZ(edit_view2, "edit_view");
            paidRoomCheckDialog7.removeFilter(edit_view2);
        }
        PaidRoomCheckDialog paidRoomCheckDialog8 = (PaidRoomCheckDialog) iDObjectS178S0100000_5.l0;
        if (paidRoomCheckDialog8.isInput && paidRoomCheckDialog8.counts > 0) {
            paidRoomCheckDialog8.isInput = false;
        }
    }

    public static final void afterTextChanged$6(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        String str;
        boolean z;
        o.LJIIIZ(s, "s");
        AskQuestionDialog askQuestionDialog = (AskQuestionDialog) iDObjectS178S0100000_5.l0;
        if (!askQuestionDialog.isViewValid) {
            return;
        }
        Editable text = ((C19K) askQuestionDialog._$_findCachedViewById(R.id.ijh)).getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        askQuestionDialog.LJLJI = str;
        View _$_findCachedViewById = ((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.iji);
        if (new OJD("\\s").replace(((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLJI, "").length() > 0) {
            z = true;
        } else {
            z = false;
        }
        _$_findCachedViewById.setEnabled(z);
        int length = ((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLJI.length();
        AskQuestionDialog askQuestionDialog2 = (AskQuestionDialog) iDObjectS178S0100000_5.l0;
        if (length > askQuestionDialog2.LJLIL) {
            C0Y4.LIZ("livesdk_qa_trigger_word_limit");
            AskQuestionDialog askQuestionDialog3 = (AskQuestionDialog) iDObjectS178S0100000_5.l0;
            String substring = askQuestionDialog3.LJLJI.substring(0, askQuestionDialog3.LJLIL);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ((TextView) ((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ijh)).setText(substring);
            AskQuestionDialog askQuestionDialog4 = (AskQuestionDialog) iDObjectS178S0100000_5.l0;
            length = askQuestionDialog4.LJLIL;
            ((EditText) askQuestionDialog4._$_findCachedViewById(R.id.ijh)).setSelection(((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLIL);
            AskQuestionDialog askQuestionDialog5 = (AskQuestionDialog) iDObjectS178S0100000_5.l0;
            TextView questionEdit = (TextView) askQuestionDialog5._$_findCachedViewById(R.id.ijh);
            o.LJIIIIZZ(questionEdit, "questionEdit");
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLIL);
            askQuestionDialog5.LJLJJI = lengthFilter;
            questionEdit.setFilters(new InputFilter[]{lengthFilter});
            C29306Beo.LJJLJLI(((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ngu));
        } else {
            C29306Beo.LJIIIZ(askQuestionDialog2._$_findCachedViewById(R.id.ngu));
            AskQuestionDialog askQuestionDialog6 = (AskQuestionDialog) iDObjectS178S0100000_5.l0;
            TextView questionEdit2 = (TextView) askQuestionDialog6._$_findCachedViewById(R.id.ijh);
            o.LJIIIIZZ(questionEdit2, "questionEdit");
            if (askQuestionDialog6.LJLJJI != null) {
                questionEdit2.setFilters(new InputFilter[0]);
                askQuestionDialog6.LJLJJI = null;
            }
        }
        if (((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLILLLLZI && length > 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_qa_begin_to_type");
            LIZ.LJIIZILJ();
            LIZ.LJIIL("click");
            LIZ.LJJIIJZLJL();
            ((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLILLLLZI = false;
        }
    }

    public static final void afterTextChanged$7(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable s) {
        int i;
        o.LJIIIZ(s, "s");
        ((DrawGuessStartFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.kcs).setEnabled(!ujb.o.LJJJJJL(s.toString()));
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) iDObjectS178S0100000_5.l0;
        if (drawGuessStartFragment.LJLJLLL) {
            drawGuessStartFragment.LJLJLLL = false;
            return;
        }
        drawGuessStartFragment.LJLJLJ = false;
        String obj = s.toString();
        if (o.LJ(drawGuessStartFragment.LJLLI, obj)) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < obj.length(); i4++) {
            if (new OJD("^[\\u4E00-\\u9FA5\\u3007\\uFA0E\\uFA0F\\uFA11\\uFA13\\uFA14\\uFA1F\\uFA21\\uFA23\\uFA24\\uFA27-\\uFA29\\u3004-\\u4DB5\\x{20000}-\\x{2A6D6}\\u9FA6-\\u9FB3\\u9FB4-\\u9FBB\\u9FBC-\\u9FC2\\u4039\\u9FC3\\x{2A700}-\\x{2B734}\\u9FC4-\\u9FCB\\x{2B740}-\\x{2B81D}\\u9FCC\\x{2B820}-\\x{2CEA1}\\u9FCD-\\u9FCF\\u4CA4\\u9FD0\\u9FD1-\\u9FD5\\x{2CEB0}-\\x{2EBE0}\\u9FD6-\\u9FEA\\u9FEB-\\u9FEF\\x{30000}-\\x{3134A}\\u9FF0-\\u9FFC\\u4DB6-\\u4DBF\\x{2A6D7}-\\x{2A6DD}\\x{31400}-\\x{33D1F}\\x{33E00}-\\x{355FF}]{0,}$").matches(String.valueOf(obj.charAt(i4)))) {
                i = 2;
            } else {
                i = 1;
            }
            i2 += i;
            if (i2 > 15) {
                C30868C9o.LIZJ(R.string.krz);
                String substring = obj.substring(0, i3);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                drawGuessStartFragment.LJLLI = substring;
                ((TextView) drawGuessStartFragment._$_findCachedViewById(R.id.cos)).setText(drawGuessStartFragment.LJLLI);
                ((EditText) drawGuessStartFragment._$_findCachedViewById(R.id.cos)).setSelection(String.valueOf(((C19K) drawGuessStartFragment._$_findCachedViewById(R.id.cos)).getText()).length());
                return;
            }
            i3++;
        }
    }

    public static final void afterTextChanged$8(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable editable) {
        String str;
        List<GameTag> list;
        LiveMode liveMode;
        C0NB.LJIIIZ("GameCategoryListDialog", "afterTextChanged.");
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        String charSequence = s.LJZI(str).toString();
        GameCategoryListFragment gameCategoryListFragment = (GameCategoryListFragment) iDObjectS178S0100000_5.l0;
        BI8 bi8 = gameCategoryListFragment.LJLIL;
        if (bi8 != null) {
            list = bi8.LJLJI;
        } else {
            list = null;
        }
        boolean z = true;
        if (list != null) {
            if (!TextUtils.isEmpty(charSequence) && GameBroadcastGameTagOpSetting.INSTANCE.enable() && (liveMode = gameCategoryListFragment.LJLJJL) != null && C29137Bc5.LIZJ(liveMode)) {
                gameCategoryListFragment.LJLJL = charSequence;
                ((GameCategoryListFragment) iDObjectS178S0100000_5.l0).getContext();
                if (C2NU.LIZ.LIZIZ()) {
                    C0K5 c0k5 = (C0K5) ((GameCategoryListFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.dqa);
                    if (c0k5 != null) {
                        c0k5.LJFF();
                    }
                    AbstractC73672Svk LIZ = C1EW.LIZ(((HashtagApi) Q7L.LIZIZ(HashtagApi.class)).searchGameTag(((GameCategoryListFragment) iDObjectS178S0100000_5.l0).wl(), CardStruct.IStatusCode.DEFAULT, charSequence, "", "", Boolean.FALSE, 0, 50));
                    GameCategoryListFragment gameCategoryListFragment2 = (GameCategoryListFragment) iDObjectS178S0100000_5.l0;
                    LIZ.LJJJLIIL(new AfS22S1300000_5(iDObjectS178S0100000_5, gameCategoryListFragment2, charSequence, list, 1), new AfS22S1300000_5(iDObjectS178S0100000_5, gameCategoryListFragment2, charSequence, list, 2));
                } else {
                    C0K5 c0k52 = (C0K5) ((GameCategoryListFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.dqa);
                    if (c0k52 != null) {
                        c0k52.LJI();
                    }
                }
            } else {
                C0K5 c0k53 = (C0K5) gameCategoryListFragment._$_findCachedViewById(R.id.dqa);
                if (c0k53 != null) {
                    c0k53.LIZLLL();
                }
                iDObjectS178S0100000_5.LIZ$0(charSequence, list);
            }
        }
        if (editable != null && !ujb.o.LJJJJJL(editable)) {
            z = false;
        }
        if (!z) {
            ((ImageView) ((GameCategoryListFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ecb)).setVisibility(0);
        } else {
            ((ImageView) ((GameCategoryListFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ecb)).setVisibility(8);
        }
    }

    public static final void afterTextChanged$9(IDObjectS178S0100000_5 iDObjectS178S0100000_5, Editable editable) {
        boolean z;
        String str;
        View _$_findCachedViewById;
        View _$_findCachedViewById2;
        TextView textView;
        if (editable == null) {
            return;
        }
        LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment = (LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0;
        liveGiftReminderAmountKeyboardFragment.getClass();
        String obj = editable.toString();
        boolean z2 = true;
        if (editable.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && editable.length() != 1) {
            obj = new OJD("^0*").replaceFirst(obj, "");
            if (obj.length() == 0) {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            if (!o.LJ(obj, editable.toString()) && (textView = (TextView) liveGiftReminderAmountKeyboardFragment._$_findCachedViewById(R.id.fdz)) != null) {
                textView.setText(obj);
            }
        }
        ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0).wl(obj);
        View _$_findCachedViewById3 = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fe0);
        if (obj.length() == 0) {
            C29306Beo.LJI(_$_findCachedViewById3);
        } else {
            C29306Beo.LJJLJLI(_$_findCachedViewById3);
        }
        ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0).getClass();
        String str2 = ".";
        if (!o.LJ(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), ".")) {
            str = ".";
        } else {
            str = ",";
        }
        if (ujb.o.LJJJJZ(obj, str, "", false).length() <= 9) {
            View _$_findCachedViewById4 = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fe8);
            if (_$_findCachedViewById4 != null) {
                C29306Beo.LJI(_$_findCachedViewById4);
            }
            LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment2 = (LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0;
            if (liveGiftReminderAmountKeyboardFragment2.LJLIL && (_$_findCachedViewById2 = liveGiftReminderAmountKeyboardFragment2._$_findCachedViewById(R.id.fec)) != null) {
                C29306Beo.LJJLJLI(_$_findCachedViewById2);
            }
            ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fdx).setBackgroundResource(R.drawable.bmx);
            View _$_findCachedViewById5 = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ayd);
            if (obj.length() == 0 || o.LJ(obj, CardStruct.IStatusCode.DEFAULT)) {
                z2 = false;
            }
            _$_findCachedViewById5.setEnabled(z2);
        } else {
            View keyboard_max_length = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fe8);
            o.LJIIIIZZ(keyboard_max_length, "keyboard_max_length");
            if (keyboard_max_length.getVisibility() == 8) {
                View keyboard_suggested_money_text = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fec);
                o.LJIIIIZZ(keyboard_suggested_money_text, "keyboard_suggested_money_text");
                if (keyboard_suggested_money_text.getVisibility() == 0 && (_$_findCachedViewById = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fec)) != null) {
                    C29306Beo.LJI(_$_findCachedViewById);
                }
                View _$_findCachedViewById6 = ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fe8);
                if (_$_findCachedViewById6 != null) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById6);
                }
            }
            ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fdx).setBackgroundResource(R.drawable.bmy);
            ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ayd).setEnabled(false);
        }
        ((TextView) ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fdz)).removeTextChangedListener(iDObjectS178S0100000_5);
        String valueOf = String.valueOf(((C19K) ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fdz)).getText());
        if (o.LJ(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), ".")) {
            str2 = ",";
        }
        String LIZ = BEC.LIZ(ujb.o.LJJJJZ(valueOf, str2, "", false));
        LiveGiftReminderAmountKeyboardFragment liveGiftReminderAmountKeyboardFragment3 = (LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0;
        ((TextView) liveGiftReminderAmountKeyboardFragment3._$_findCachedViewById(R.id.fdz)).setText(LIZ);
        liveGiftReminderAmountKeyboardFragment3.wl(LIZ);
        ((EditText) liveGiftReminderAmountKeyboardFragment3._$_findCachedViewById(R.id.fdz)).setSelection(LIZ.length());
        ((TextView) ((LiveGiftReminderAmountKeyboardFragment) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.fdz)).addTextChangedListener(iDObjectS178S0100000_5);
    }

    public final void LIZ$0(String searchContent, List sourceData) {
        boolean z;
        if (C30922CBq.LIZIZ) {
            FP1.LJFF("search game tag by local, content: ", searchContent, "GameCategoryListDialog");
        }
        o.LJIIIZ(sourceData, "sourceData");
        o.LJIIIZ(searchContent, "searchContent");
        ArrayList arrayList = new ArrayList();
        Iterator it = sourceData.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            GameTag gameTag = (GameTag) next;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("(?i)");
            LIZ.append(Pattern.quote(searchContent));
            Pattern compile = PatternProtector.compile(X1D.LIZIZ(LIZ));
            String str = gameTag.showName;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Matcher matcher = compile.matcher(str);
            String str3 = gameTag.fullName;
            if (str3 == null) {
                str3 = "";
            }
            Matcher matcher2 = compile.matcher(str3);
            String str4 = gameTag.shortName;
            if (str4 != null) {
                str2 = str4;
            }
            Matcher matcher3 = compile.matcher(str2);
            if (matcher.find() || matcher2.find() || matcher3.find() || gameTag.isNonGameOrOtherGameItem()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            GameTag gameTag2 = (GameTag) next2;
            if (C78934UyQ.LJIJJLI(arrayList)) {
                if (gameTag2.isNonGameOrOtherGameItem()) {
                    arrayList2.add(next2);
                }
            } else {
                if ((!ujb.o.LJJJJJL(searchContent)) && gameTag2.isNonGameOrOtherGameItem()) {
                }
                arrayList2.add(next2);
            }
        }
        boolean LJIJJLI = C78934UyQ.LJIJJLI(arrayList2);
        if (LJIJJLI) {
            LIZIZ$1(true);
        } else {
            LIZIZ$1(false);
        }
        if (searchContent.length() <= 0 || LJIJJLI) {
            z = false;
        }
        BI8 bi8 = ((GameCategoryListFragment) this.l0).LJLIL;
        if (bi8 != null) {
            bi8.LJLJL = arrayList2;
            bi8.LJLJLJ = searchContent;
            bi8.LJLJLLL = z;
            bi8.notifyDataSetChanged();
        }
        ((GameCategoryListFragment) this.l0).LJLJLJ = false;
    }

    public static final void onTextChanged$12(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence charSequence, int i, int i2, int i3) {
        if (s.LJJJLZIJ(String.valueOf(charSequence), "\n", false)) {
            LiveEditText liveEditText = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText != null) {
                liveEditText.setText(ujb.o.LJJJJZ(String.valueOf(charSequence), "\n", " ", false));
            }
            LiveEditText liveEditText2 = ((StarCommentPaymentDialog) iDObjectS178S0100000_5.l0).LJLLL;
            if (liveEditText2 != null) {
                liveEditText2.setSelection(i + i3);
            }
        }
    }

    public static final void onTextChanged$6(IDObjectS178S0100000_5 iDObjectS178S0100000_5, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        if (((AskQuestionDialog) iDObjectS178S0100000_5.l0).LJLLL && s.length() == 0 && (!C28874BUw.LJ.isEmpty())) {
            C29306Beo.LJJLJLI(((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ksj));
            C29306Beo.LJI(((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.iji));
        } else {
            C29306Beo.LJI(((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.ksj));
            C29306Beo.LJJLJLI(((AskQuestionDialog) iDObjectS178S0100000_5.l0)._$_findCachedViewById(R.id.iji));
        }
    }
}
