package X;

import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8F8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F8 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDescTagAssem, C8F9, C76800UCe> {
    public static final C8F8 LJLIL = new C8F8();

    public C8F8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDescTagAssem videoDescTagAssem, C8F9 c8f9) {
        TextView textView;
        VideoDescTagAssem subscribe = videoDescTagAssem;
        C8F9 it = c8f9;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(it, "it");
        TuxTextView tuxTextView = subscribe.LJZL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
            TuxTag tuxTag = subscribe.LL;
            if (tuxTag != null) {
                tuxTag.setVisibility(8);
                if (it.LJLIL != 8 || it.LJLILLLLZI != 8) {
                    if (it.LJLJJLL) {
                        textView = subscribe.LL;
                        if (textView == null) {
                            o.LJIJI("transPromotedTagView");
                            throw null;
                        }
                    } else {
                        textView = subscribe.LJZL;
                        if (textView == null) {
                            o.LJIJI("promotedTagView");
                            throw null;
                        }
                    }
                    textView.setVisibility(0);
                    textView.setText(it.LJLJJL);
                    if (it.LJLJJLL) {
                        C8HI LIZJ = C8HI.LIZJ();
                        TuxTag tuxTag2 = subscribe.LL;
                        if (tuxTag2 != null) {
                            LIZJ.LIZIZ(tuxTag2, "medium");
                            Integer num = it.LJLJI;
                            if (num != null) {
                                int intValue = num.intValue();
                                TuxTag tuxTag3 = subscribe.LL;
                                if (tuxTag3 != null) {
                                    tuxTag3.setTagBackgroundColor(intValue);
                                } else {
                                    o.LJIJI("transPromotedTagView");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("transPromotedTagView");
                            throw null;
                        }
                    } else {
                        Integer num2 = it.LJLJI;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            TuxTextView tuxTextView2 = subscribe.LJZL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setBackgroundColor(intValue2);
                            } else {
                                o.LJIJI("promotedTagView");
                                throw null;
                            }
                        }
                        Integer num3 = it.LJLJJI;
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            TuxTextView tuxTextView3 = subscribe.LJZL;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setTextColor(intValue3);
                            } else {
                                o.LJIJI("promotedTagView");
                                throw null;
                            }
                        }
                    }
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("transPromotedTagView");
            throw null;
        }
        o.LJIJI("promotedTagView");
        throw null;
    }
}
