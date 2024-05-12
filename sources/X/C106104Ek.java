package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106104Ek extends AbstractC106224Ew {
    public static final /* synthetic */ int LJLLI = 0;
    public final Fragment LJLILLLLZI;
    public final View LJLJI;
    public final C99033ud LJLJJI;
    public Integer LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final ViewGroup.LayoutParams LJLJLJ;
    public final RecyclerView.LayoutParams LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // X.AbstractC106224Ew
    public final void L() {
        String str;
        String str2;
        String str3 = "";
        String str4 = null;
        if (this.LJLJJI.isTakoChat$im_base_release()) {
            String enterFromForMob = this.LJLJJI.getEnterFromForMob();
            String enterMethod = this.LJLJJI.getEnterMethod();
            String searchId = this.LJLJJI.getSearchId();
            String conversationId = this.LJLJJI.getConversationId();
            Integer num = this.LJLJJL;
            ActionBarButtonConf actionBarButtonConf = this.LJLIL;
            if (actionBarButtonConf != null) {
                str = actionBarButtonConf.getTitle();
            } else {
                str = null;
            }
            String M = M(num, str);
            if (M != null) {
                str3 = M;
            }
            ActionBarButtonConf actionBarButtonConf2 = this.LJLIL;
            if (o.LJ(this.LJLJJI.getEnterFromForMob(), "homepage_hot_tikbot") && actionBarButtonConf2 != null && actionBarButtonConf2.getFromEnterPageQuery()) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            String valueOf = String.valueOf(getBindingAdapterPosition());
            ActionBarButtonConf actionBarButtonConf3 = this.LJLIL;
            if (actionBarButtonConf3 != null) {
                str4 = actionBarButtonConf3.getQueryMessageId();
            }
            C97113rX.LIZIZ(enterFromForMob, enterMethod, searchId, conversationId, str3, str2, valueOf, str4);
            return;
        }
        Integer num2 = this.LJLJJL;
        ActionBarButtonConf actionBarButtonConf4 = this.LJLIL;
        if (actionBarButtonConf4 != null) {
            str4 = actionBarButtonConf4.getTitle();
        }
        String M2 = M(num2, str4);
        if (M2 != null) {
            str3 = M2;
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        c1hq.put("interaction_name", str3);
        onEventV3.LIZIZ("quick_interaction_show", c1hq);
    }

    public static String M(Integer num, String str) {
        int value = EnumC106114El.NORMAL_EMOJI.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC106114El.ANIMATED_EMOJI.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC106114El.SUGGESTED_QUERY.getValue();
                if (num == null || num.intValue() != value3) {
                    int value4 = EnumC106114El.SUGGESTED_REPLY.getValue();
                    if (num == null || num.intValue() != value4) {
                        int value5 = EnumC106114El.STICKER.getValue();
                        if (num == null || num.intValue() != value5) {
                            int value6 = EnumC106114El.VIDEO_SHARE.getValue();
                            if (num == null || num.intValue() != value6) {
                                int value7 = EnumC106114El.STICKER_STORE.getValue();
                                if (num == null || num.intValue() != value7) {
                                    int value8 = EnumC106114El.NUDGE.getValue();
                                    if (num == null || num.intValue() != value8) {
                                        int value9 = EnumC106114El.NUDGE_BACK.getValue();
                                        if (num == null || num.intValue() != value9) {
                                            return "";
                                        }
                                        return EnumC106134En.NUDGE_BACK.getValue();
                                    }
                                    return EnumC106134En.NUDGE.getValue();
                                }
                                return "store";
                            }
                            return "quick_share";
                        }
                        return str;
                    }
                    return str;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public C106104Ek(Fragment fragment, View view, C99033ud c99033ud) {
        super(view);
        this.LJLILLLLZI = fragment;
        this.LJLJI = view;
        this.LJLJJI = c99033ud;
        this.LJLJLJ = view.getLayoutParams();
        this.LJLJLLL = new RecyclerView.LayoutParams(0, 0);
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 976));
    }

    public final void N(View view, Integer num, Integer num2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (num2 != null) {
                marginLayoutParams.setMarginEnd(num2.intValue() + this.LJLJJLL);
            }
            if (num != null) {
                marginLayoutParams.setMarginStart(num.intValue() + this.LJLJJLL);
            }
        }
    }
}
