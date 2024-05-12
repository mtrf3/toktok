package com.bytedance.android.livesdk.hotword.ui;

import X.B83;
import X.BQO;
import X.BZI;
import X.C10A;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C41051jJ;
import X.C47061t0;
import X.C47121t6;
import X.C69607RTn;
import X.C78720Uuy;
import X.EnumC32853Cuv;
import X.KMP;
import X.TTL;
import X.UXA;
import X.UXD;
import X.UXE;
import X.UXH;
import X.UXN;
import X.UXS;
import X.UXU;
import X.UXV;
import X.ViewOnClickListenerC77346UXe;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS62S0201000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HotWordGiftConfirmDialogFragment extends LiveDialogFragment {
    public View LJLIL;
    public View LJLILLLLZI;
    public C47061t0 LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public View LJLJLLL;
    public C41051jJ LJLL;
    public Gift LJLLI;
    public GuideKeywordsResponse.UserInfo LJLLILLLL;
    public C69607RTn LJLLJ;
    public HotWordGiftViewModel LJLLL;
    public boolean LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d6g);
        c28507BGt.LJII = 17;
        c28507BGt.LIZJ = R.style.abj;
        c28507BGt.LJIILIIL = 48;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window2.setNavigationBarColor(-16777216);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window2.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        C41051jJ c41051jJ;
        HotWordGiftViewModel hotWordGiftViewModel;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.LJLLJ == null || this.LJLLILLLL == null || (c41051jJ = this.LJLL) == null) {
            return;
        }
        if (this.LJLLLL) {
            this.LJLLLL = false;
            if (c41051jJ.isChecked() && (hotWordGiftViewModel = this.LJLLL) != null) {
                UXN uxn = hotWordGiftViewModel.LJLJI;
                if (uxn != null) {
                    uxn.LJ();
                } else {
                    o.LJIJI("userRepository");
                    throw null;
                }
            }
            HotWordGiftViewModel hotWordGiftViewModel2 = this.LJLLL;
            if (hotWordGiftViewModel2 != null) {
                hotWordGiftViewModel2.kv0(true, true);
            }
            HotWordGiftViewModel hotWordGiftViewModel3 = this.LJLLL;
            if (hotWordGiftViewModel3 != null) {
                Gift gift = this.LJLLI;
                if (gift != null) {
                    hotWordGiftViewModel3.nv0(gift, EnumC32853Cuv.OVERLAY_WINDOW_SEND);
                } else {
                    o.LJIJI("curGift");
                    throw null;
                }
            }
            C69607RTn c69607RTn = this.LJLLJ;
            if (c69607RTn != null) {
                int i = c69607RTn.LIZ;
                EnumC32853Cuv enumC32853Cuv = EnumC32853Cuv.SEND;
                GuideKeywordsResponse.UserInfo userInfo = this.LJLLILLLL;
                if (userInfo != null) {
                    boolean z = userInfo.isInEea;
                    C41051jJ c41051jJ2 = this.LJLL;
                    if (c41051jJ2 != null) {
                        vl(i, enumC32853Cuv, z, c41051jJ2.isChecked());
                        return;
                    } else {
                        o.LJIJI("checkBox");
                        throw null;
                    }
                }
                o.LJIJI("curUserInfo");
                throw null;
            }
            o.LJIJI("curConfirmationState");
            throw null;
        }
        HotWordGiftViewModel hotWordGiftViewModel4 = this.LJLLL;
        if (hotWordGiftViewModel4 != null) {
            hotWordGiftViewModel4.kv0(false, false);
        }
        C69607RTn c69607RTn2 = this.LJLLJ;
        if (c69607RTn2 != null) {
            int i2 = c69607RTn2.LIZ;
            EnumC32853Cuv enumC32853Cuv2 = EnumC32853Cuv.USER_CLOSE;
            GuideKeywordsResponse.UserInfo userInfo2 = this.LJLLILLLL;
            if (userInfo2 != null) {
                boolean z2 = userInfo2.isInEea;
                C41051jJ c41051jJ3 = this.LJLL;
                if (c41051jJ3 != null) {
                    vl(i2, enumC32853Cuv2, z2, c41051jJ3.isChecked());
                    return;
                } else {
                    o.LJIJI("checkBox");
                    throw null;
                }
            }
            o.LJIJI("curUserInfo");
            throw null;
        }
        o.LJIJI("curConfirmationState");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Gift gift;
        GuideKeywordsResponse.UserInfo userInfo;
        UXV uxh;
        List<String> list;
        String str;
        UXD uxd;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.e7z);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.hot_word_gift_confirm_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.e82);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.h…_gift_confirm_white_root)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.e7v);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.hot_word_gift_confirm_icon)");
        this.LJLJI = (C47061t0) findViewById3;
        View findViewById4 = view.findViewById(R.id.e81);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.h…_word_gift_confirm_title)");
        this.LJLJJI = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.e7t);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.hot_word_gift_confirm_desc)");
        this.LJLJJL = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.e7w);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.hot_word_gift_confirm_link)");
        this.LJLJJLL = (C47121t6) findViewById6;
        View findViewById7 = view.findViewById(R.id.e7x);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.h…nfirm_radio_button_group)");
        this.LJLJLLL = findViewById7;
        View findViewById8 = view.findViewById(R.id.e7s);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.h…d_gift_confirm_check_box)");
        this.LJLL = (C41051jJ) findViewById8;
        o.LJIIIIZZ(view.findViewById(R.id.e7y), "view.findViewById(R.id.h…onfirm_radio_button_text)");
        View findViewById9 = view.findViewById(R.id.e80);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.hot_word_gift_confirm_send)");
        this.LJLJL = (C47121t6) findViewById9;
        View findViewById10 = view.findViewById(R.id.e7u);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.h…_gift_confirm_disclaimer)");
        this.LJLJLJ = (C47121t6) findViewById10;
        HotWordGiftViewModel hotWordGiftViewModel = this.LJLLL;
        if (hotWordGiftViewModel == null) {
            dismiss();
            return;
        }
        C69607RTn c69607RTn = (C69607RTn) hotWordGiftViewModel.LJLLJ.getValue();
        UXE uxe = (UXE) hotWordGiftViewModel.LJLLI.getValue();
        if (uxe != null && (uxd = uxe.LIZJ) != null) {
            gift = uxd.LIZ;
        } else {
            gift = null;
        }
        UXE uxe2 = (UXE) hotWordGiftViewModel.LJLLI.getValue();
        if (uxe2 != null) {
            userInfo = uxe2.LIZLLL;
        } else {
            userInfo = null;
        }
        if (c69607RTn == null || gift == null || userInfo == null) {
            dismiss();
            return;
        }
        this.LJLLJ = c69607RTn;
        this.LJLLI = gift;
        this.LJLLILLLL = userInfo;
        int i = c69607RTn.LIZ;
        String str2 = c69607RTn.LJ;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    uxh = new UXU(gift);
                } else {
                    throw new IllegalArgumentException(KMP.LJ("Unknown ConfirmationType: ", i));
                }
            } else {
                uxh = new UXS(gift);
            }
        } else {
            if (str2 == null) {
                str2 = "";
            }
            uxh = new UXH(HotWordGiftSettings.INSTANCE.getEeaPopupIntervalInHours(), gift, str2);
        }
        GuideKeywordsResponse.UserInfo userInfo2 = this.LJLLILLLL;
        if (userInfo2 != null) {
            boolean z = userInfo2.isInEea;
            if (i != 1) {
                if (i != 2) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_gift_high_price_gift_double_confirmation_popup_show");
                    if (z) {
                        str = "EEA";
                    } else {
                        str = "nonEEA";
                    }
                    LIZ.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZ, str, "region")).getCurrentUserId()), "user_id");
                    LIZ.LJIIZILJ();
                    LIZ.LJJIIJZLJL();
                } else {
                    UXA.LIZIZ(false);
                }
            } else {
                UXA.LIZIZ(true);
            }
            BQO LIZ2 = C15650jR.LIZ();
            Gift gift2 = this.LJLLI;
            if (gift2 != null) {
                ImageModel imageModel = gift2.icon;
                if (imageModel != null) {
                    list = imageModel.getUrls();
                } else {
                    list = null;
                }
                C78720Uuy LIZ3 = LIZ2.LIZ(list);
                LIZ3.LJIIIIZZ = R.drawable.d1o;
                C47061t0 c47061t0 = this.LJLJI;
                if (c47061t0 != null) {
                    LIZ3.LJIIJJI(c47061t0);
                    C47121t6 c47121t6 = this.LJLJJI;
                    if (c47121t6 != null) {
                        c47121t6.setText(uxh.LIZ);
                        C47121t6 c47121t62 = this.LJLJJL;
                        if (c47121t62 != null) {
                            c47121t62.setText(uxh.LIZIZ);
                            if (C29306Beo.LJIJJLI(uxh.LIZJ)) {
                                C47121t6 c47121t63 = this.LJLJJLL;
                                if (c47121t63 != null) {
                                    C29306Beo.LJJLJLI(c47121t63);
                                    C47121t6 c47121t64 = this.LJLJJLL;
                                    if (c47121t64 != null) {
                                        C16880lQ.LJJIIZ(c47121t64, new ACListenerS47S0200000_13(uxh, this, 53));
                                    } else {
                                        o.LJIJI("linkText");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("linkText");
                                    throw null;
                                }
                            }
                            if (uxh.LIZLLL) {
                                View view2 = this.LJLJLLL;
                                if (view2 != null) {
                                    C29306Beo.LJJLJLI(view2);
                                } else {
                                    o.LJIJI("checkBoxGroup");
                                    throw null;
                                }
                            }
                            if (C29306Beo.LJIJJLI(uxh.LJ)) {
                                C47121t6 c47121t65 = this.LJLJLJ;
                                if (c47121t65 != null) {
                                    C29306Beo.LJJLJLI(c47121t65);
                                    C47121t6 c47121t66 = this.LJLJLJ;
                                    if (c47121t66 != null) {
                                        c47121t66.setText(uxh.LJ);
                                    } else {
                                        o.LJIJI("disclaimerText");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("disclaimerText");
                                    throw null;
                                }
                            }
                            View view3 = this.LJLIL;
                            if (view3 != null) {
                                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 200), view3);
                                View view4 = this.LJLILLLLZI;
                                if (view4 != null) {
                                    C16880lQ.LJIIJ(ViewOnClickListenerC77346UXe.LJLIL, view4);
                                    C47121t6 c47121t67 = this.LJLJL;
                                    if (c47121t67 != null) {
                                        Gift gift3 = this.LJLLI;
                                        if (gift3 != null) {
                                            int i2 = gift3.diamondCount;
                                            c47121t67.setText(C15380j0.LJIIIIZZ(R.plurals.ll, i2, Integer.valueOf(i2)));
                                            C47121t6 c47121t68 = this.LJLJL;
                                            if (c47121t68 != null) {
                                                C29306Beo.LJJL(c47121t68, R.id.e80, 500L, new AqS62S0201000_13(i, hotWordGiftViewModel, this, 4));
                                                return;
                                            } else {
                                                o.LJIJI("sendButton");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("curGift");
                                        throw null;
                                    }
                                    o.LJIJI("sendButton");
                                    throw null;
                                }
                                o.LJIJI("dialogView");
                                throw null;
                            }
                            o.LJIJI("backgroundView");
                            throw null;
                        }
                        o.LJIJI("descText");
                        throw null;
                    }
                    o.LJIJI("titleText");
                    throw null;
                }
                o.LJIJI("icon");
                throw null;
            }
            o.LJIJI("curGift");
            throw null;
        }
        o.LJIJI("curUserInfo");
        throw null;
    }

    public static void vl(int i, EnumC32853Cuv closeReason, boolean z, boolean z2) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                o.LJIIIZ(closeReason, "closeReason");
                BZI LIZ = C28787BRn.LIZ("livesdk_gift_high_price_gift_double_confirmation_popup_close");
                if (z) {
                    str = "EEA";
                } else {
                    str = "nonEEA";
                }
                LIZ.LJIJJ(str, "region");
                LIZ.LJIJJ(closeReason.getDesc$livegift_impl_release(), "close_reason");
                LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_do_not_show_be_clicked");
                LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
                return;
            }
            UXA.LIZ(false, closeReason);
            return;
        }
        UXA.LIZ(true, closeReason);
    }
}
