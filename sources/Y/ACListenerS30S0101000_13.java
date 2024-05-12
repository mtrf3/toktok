package Y;

import X.ARH;
import X.ARI;
import X.AY5;
import X.B3N;
import X.BZI;
import X.C03880Dg;
import X.C158056If;
import X.C161416Vd;
import X.C161436Vf;
import X.C161486Vk;
import X.C16880lQ;
import X.C176096vd;
import X.C176106ve;
import X.C176996x5;
import X.C17N;
import X.C188727au;
import X.C227768wm;
import X.C26227ARb;
import X.C28787BRn;
import X.C2YJ;
import X.C30868C9o;
import X.C39576Fg4;
import X.C42842Gre;
import X.C42844Grg;
import X.C42846Gri;
import X.C43881HKb;
import X.C65300Pk0;
import X.C73943T0h;
import X.C76548U2m;
import X.C78920UyC;
import X.C78974Uz4;
import X.C78975Uz5;
import X.CN1;
import X.DialogC254019y1;
import X.DialogC77438UaI;
import X.EnumC78973Uz3;
import X.FMX;
import X.HG3;
import X.InterfaceC56521MGf;
import X.OSZ;
import X.RBX;
import X.U3D;
import X.U3E;
import X.UFQ;
import X.UHL;
import X.V86;
import X.XX7;
import X.XYM;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLinkMicBlockOrientSetting;
import com.bytedance.android.livesdk.watch.HorizontalOrientationChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.internal.WebDialog;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ACListenerS30S0101000_13 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        switch (aCListenerS30S0101000_13.i1) {
            case 0:
                ((XX7) aCListenerS30S0101000_13.l0).LJLJI.onInternalEvent(new XYM("import_sounds_from_device_click"));
                return;
            case 1:
                AY5 ay5 = (AY5) aCListenerS30S0101000_13.l0;
                ay5.getClass();
                C39576Fg4.LIZ(3);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "homepage_hot");
                c188727au.LJIIIZ("language_type", "cancel");
                FMX.LJIIL("choose_language_popup", c188727au.LIZ);
                ay5.dismiss();
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS30S0101000_13.l0).lambda$initUnits$43(view);
                return;
        }
    }

    public static final void onClick$1(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        switch (aCListenerS30S0101000_13.i1) {
            case 0:
                DialogC77438UaI dialogC77438UaI = (DialogC77438UaI) ((View.OnCreateContextMenuListener) aCListenerS30S0101000_13.l0);
                if (!dialogC77438UaI.LLIIIZ) {
                    DialogC77438UaI.LJJIIJZLJL(false, dialogC77438UaI.LLD);
                    new Handler().postDelayed(new ARunnableS9S0101000_5(2, dialogC77438UaI, 12), 100L);
                }
                DialogInterface.OnClickListener onClickListener = dialogC77438UaI.LLIIIILZ;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogC77438UaI, 0);
                    return;
                }
                return;
            default:
                DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) ((View.OnCreateContextMenuListener) aCListenerS30S0101000_13.l0);
                InterfaceC56521MGf interfaceC56521MGf = detailAwemeListFragment.LLILII;
                if (interfaceC56521MGf != null) {
                    interfaceC56521MGf.LJ();
                }
                detailAwemeListFragment.refresh();
                return;
        }
    }

    public static final void onClick$2(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        switch (aCListenerS30S0101000_13.i1) {
            case 0:
                DialogC77438UaI dialogC77438UaI = (DialogC77438UaI) ((View.OnCreateContextMenuListener) aCListenerS30S0101000_13.l0);
                if (!dialogC77438UaI.LLIIIL) {
                    DialogC77438UaI.LJJIIJZLJL(false, dialogC77438UaI.LLD);
                    new Handler().postDelayed(new ARunnableS15S0101000_11(2, dialogC77438UaI, 9), 100L);
                }
                DialogInterface.OnClickListener onClickListener = dialogC77438UaI.LLIIII;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogC77438UaI, 1);
                    return;
                }
                return;
            case 1:
                WebDialog this$0 = (WebDialog) ((View.OnCreateContextMenuListener) aCListenerS30S0101000_13.l0);
                o.LJIIIZ(this$0, "this$0");
                this$0.cancel();
                return;
            default:
                ((SettingNewVersionFragment) ((View.OnCreateContextMenuListener) aCListenerS30S0101000_13.l0)).lambda$initUnits$80(view);
                return;
        }
    }

    public static final void onClick$3(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        IDefinitionService iDefinitionService;
        String str;
        switch (aCListenerS30S0101000_13.i1) {
            case 0:
                FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aCListenerS30S0101000_13.l0;
                fullVideoButtonWidget.getClass();
                BZI LIZ = C28787BRn.LIZ("screen_rotate");
                LIZ.LJIJJ(String.valueOf(fullVideoButtonWidget.LJLIL), "room_id");
                LIZ.LJIJJ("portrait_to_landscape", "type");
                LIZ.LJIJJ(Integer.valueOf(fullVideoButtonWidget.LJLJI ? 1 : 0), "is_multi_guest");
                LIZ.LJIILLIIL(fullVideoButtonWidget.dataChannel);
                LIZ.LJIIL("click");
                LIZ.LJIIIZ("live");
                LIZ.LJIIJJI("live_detail");
                LIZ.LJJIIJZLJL();
                if (GameLinkMicBlockOrientSetting.INSTANCE.isDefault() && fullVideoButtonWidget.LJLJI) {
                    C30868C9o.LIZJ(R.string.n9y);
                    return;
                }
                C73943T0h.LIZ().LIZIZ(new B3N(2));
                C43881HKb.LIZJ(fullVideoButtonWidget.LJLIL, new HashMap(), "room_id", "type", "portrait_to_landscape");
                DataChannel dataChannel = fullVideoButtonWidget.dataChannel;
                if (dataChannel == null) {
                    return;
                }
                Long l = (Long) dataChannel.kv0(AudienceShowOrientationBeginTime.class);
                if (l != null && (iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class)) != null) {
                    iDefinitionService.Hu(0, l.longValue(), String.valueOf(fullVideoButtonWidget.LJLIL), 1, "click");
                    fullVideoButtonWidget.dataChannel.rv0(AudienceShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
                }
                fullVideoButtonWidget.dataChannel.pv0(HorizontalOrientationChangeEvent.class);
                return;
            case 1:
                ((XX7) aCListenerS30S0101000_13.l0).LJLJI.onInternalEvent(new XYM("import_sound_from_video_click"));
                return;
            case 2:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS30S0101000_13.l0;
                keyboardDialogFragment.getClass();
                C176106ve c176106ve = C176096vd.LIZIZ;
                c176106ve.LIZIZ();
                c176106ve.LIZIZ = System.currentTimeMillis();
                GiftStruct value = keyboardDialogFragment.LLJJ.jv0().getValue();
                if (VideoGiftService.LJI().LIZIZ() && value != null) {
                    if (!value.isFromGiftBag() && keyboardDialogFragment.LLJJ.iv0().getValue().longValue() != Long.MIN_VALUE && value.getDiamondCount() > keyboardDialogFragment.LLJJ.iv0().getValue().longValue()) {
                        ARH arh = new ARH(keyboardDialogFragment.mo49getActivity());
                        arh.LJ(R.string.tq2, new AObjectS121S0200000_3(keyboardDialogFragment, value, 2));
                        arh.LJI(R.string.cg_, new AObjectS41S0201000_8(0, keyboardDialogFragment, view, 1));
                        C26227ARb c26227ARb = new C26227ARb(keyboardDialogFragment.LLJJL);
                        c26227ARb.LJ(R.string.tpe);
                        c26227ARb.LJIIL = arh;
                        c26227ARb.LJI().LIZLLL();
                        Aweme aweme = keyboardDialogFragment.LLIZ;
                        String str2 = "";
                        if (keyboardDialogFragment.getArguments() == null) {
                            str = "";
                        } else {
                            str = keyboardDialogFragment.getArguments().getString("enterFrom");
                        }
                        GiftStruct value2 = keyboardDialogFragment.LLJJ.jv0().getValue();
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", str);
                        C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
                        if (c176996x5 != null) {
                            str2 = c176996x5.LLIIII;
                        }
                        c188727au.LJIIIZ("enter_method", str2);
                        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(aweme));
                        c188727au.LJ(value2.getId(), "gift_id");
                        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
                        FMX.LJIIL("show_comment_recharge_popup", c188727au.LIZ);
                        return;
                    }
                    C176996x5 c176996x52 = keyboardDialogFragment.LLJILJIL;
                    if (c176996x52 != null) {
                        c176996x52.LLIIII = "keyboard_enter";
                        c176996x52.LJJJJJL("keyboard_dialog");
                    }
                    keyboardDialogFragment.Kl();
                    return;
                }
                C176996x5 c176996x53 = keyboardDialogFragment.LLJILJIL;
                if (c176996x53 != null) {
                    c176996x53.LLIIII = "keyboard_enter";
                    c176996x53.LJJJJJL("keyboard_dialog");
                }
                keyboardDialogFragment.Kl();
                return;
            case 3:
                ((SettingNewVersionFragment) aCListenerS30S0101000_13.l0).lambda$initUnits$41(view);
                return;
            case 4:
                MediaPlayerModule mediaPlayerModule = ((Video2GifCutFragment) aCListenerS30S0101000_13.l0).LJLJL;
                if (mediaPlayerModule != null) {
                    if (mediaPlayerModule.LJLJJI) {
                        mediaPlayerModule.LJLJI = true;
                        mediaPlayerModule.LIZ();
                        return;
                    } else {
                        mediaPlayerModule.LJLJI = false;
                        mediaPlayerModule.LIZIZ();
                        return;
                    }
                }
                return;
            default:
                C42842Gre c42842Gre = (C42842Gre) aCListenerS30S0101000_13.l0;
                C42846Gri c42846Gri = c42842Gre.LJLJI.LJLJL;
                if (c42846Gri != null) {
                    c42846Gri.LJIIJJI();
                }
                C42844Grg c42844Grg = c42842Gre.LJLIL;
                if (c42844Grg != null) {
                    c42844Grg.LJLJI = false;
                    return;
                }
                return;
        }
    }

    public static final void onClick$4(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        ((UFQ) aCListenerS30S0101000_13.l0).LJLJI.invoke(null, Integer.valueOf(aCListenerS30S0101000_13.i1), ((UFQ) aCListenerS30S0101000_13.l0).LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$5(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        UFQ ufq = (UFQ) aCListenerS30S0101000_13.l0;
        ufq.LJLJI.invoke(ListProtector.get(ufq.LJLILLLLZI, aCListenerS30S0101000_13.i1), Integer.valueOf(aCListenerS30S0101000_13.i1), ((UFQ) aCListenerS30S0101000_13.l0).LJLILLLLZI);
    }

    public static final void onClick$6(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        boolean z = false;
        switch (aCListenerS30S0101000_13.i1) {
            case 0:
                aCListenerS30S0101000_13.l0.getClass();
                return;
            case 1:
                C161416Vd c161416Vd = (C161416Vd) aCListenerS30S0101000_13.l0;
                C161436Vf c161436Vf = c161416Vd.LJLJI;
                C161486Vk c161486Vk = c161436Vf.LJLJJL;
                if (c161486Vk != null) {
                    Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
                        next.getClass();
                        throw null;
                    }
                }
                c161436Vf.invalidate();
                c161416Vd.LLIIJLIL.clear();
                c161416Vd.LJII(false, null);
                return;
            default:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS30S0101000_13.l0;
                i18nSettingManageMyAccountActivity.getClass();
                boolean isPhoneBinded = ((RBX) HG3.LJIILL()).getCurUser().isPhoneBinded();
                FMX.LJIIL("manage_account_phone_click", C78920UyC.LIZJ(isPhoneBinded ? 1 : 0, "phone_binding_status").LIZ);
                if (isPhoneBinded) {
                    ARI ari = new ARI(i18nSettingManageMyAccountActivity);
                    ari.LJI = true;
                    ari.LJII(i18nSettingManageMyAccountActivity.getString(R.string.tfo), new AObjectS42S0101000_5(5, i18nSettingManageMyAccountActivity, 46));
                    ari.LJII(i18nSettingManageMyAccountActivity.getString(R.string.tfs), new AObjectS42S0101000_5(5, i18nSettingManageMyAccountActivity, 48));
                    DialogC254019y1 dialogC254019y1 = new DialogC254019y1(i18nSettingManageMyAccountActivity);
                    C16880lQ.LIZ(dialogC254019y1);
                    C78975Uz5 c78975Uz5 = i18nSettingManageMyAccountActivity.LLFFF;
                    User user = i18nSettingManageMyAccountActivity.LJLIL;
                    C78974Uz4 c78974Uz4 = new C78974Uz4(i18nSettingManageMyAccountActivity, ari, dialogC254019y1);
                    c78975Uz5.getClass();
                    o.LJIIIZ(user, "user");
                    try {
                        Boolean enableChangeMobileNotice = C2YJ.LIZIZ.LIZ.getMtcertSettings().getEnableChangeMobileNotice();
                        o.LJIIIIZZ(enableChangeMobileNotice, "{\n                Settin…obileNotice\n            }");
                        z = enableChangeMobileNotice.booleanValue();
                    } catch (C158056If unused) {
                    }
                    c78975Uz5.LIZ(z, user, c78974Uz4);
                    return;
                }
                i18nSettingManageMyAccountActivity.LJLJI = true;
                Bundle bundle = new Bundle();
                bundle.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeAccountManagementPhoneNumber.getValue());
                bundle.putString("page", "add");
                HG3.LJFF().bindMobile(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LLIIIZ, bundle, null);
                return;
        }
    }

    public static final void onClick$7(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        int i = aCListenerS30S0101000_13.i1;
        if (i != 0) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 15) {
                            if (i == 20) {
                                C76548U2m.LJIILLIIL("20mins");
                            }
                        } else {
                            C76548U2m.LJIILLIIL("15mins");
                        }
                    } else {
                        C76548U2m.LJIILLIIL("10mins");
                    }
                } else {
                    C76548U2m.LJIILLIIL("5mins");
                }
            } else {
                C76548U2m.LJIILLIIL("3mins");
            }
        } else {
            C76548U2m.LJIILLIIL("edit");
        }
        int i2 = aCListenerS30S0101000_13.i1;
        if (i2 == 0) {
            U3D u3d = (U3D) aCListenerS30S0101000_13.l0;
            if (u3d.LLFII == null) {
                Context context = ((U3D) aCListenerS30S0101000_13.l0).getContext();
                o.LJIIIIZZ(context, "context");
                U3D u3d2 = (U3D) aCListenerS30S0101000_13.l0;
                u3d.LLFII = new UHL(context, new U3E(u3d2), u3d2.LL, new OSZ(1, 60), R.string.nds);
            }
            UHL uhl = ((U3D) aCListenerS30S0101000_13.l0).LLFII;
            if (uhl != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/show/anchor/MultiGuestNumEditDialog", "show", uhl, new Object[0], "void", new C65300Pk0(false, "()V", "-850835929839282533")).LIZ) {
                uhl.show();
            }
            U3D u3d3 = (U3D) aCListenerS30S0101000_13.l0;
            UHL uhl2 = u3d3.LLFII;
            if (uhl2 != null) {
                uhl2.setOnDismissListener(new IDDListenerS152S0100000_13(u3d3, 21));
                return;
            }
            return;
        }
        ((U3D) aCListenerS30S0101000_13.l0).LJJIIZ(i2);
    }

    public static final void onClick$8(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        String str;
        int length;
        Editable text;
        Editable text2;
        LiveEditText liveEditText = ((UHL) aCListenerS30S0101000_13.l0).LJLL;
        if (liveEditText != null && (text2 = liveEditText.getText()) != null) {
            str = text2.toString();
        } else {
            str = null;
        }
        LiveEditText liveEditText2 = ((UHL) aCListenerS30S0101000_13.l0).LJLL;
        if (liveEditText2 != null) {
            length = liveEditText2.getSelectionStart();
        } else {
            length = String.valueOf((Object) null).length();
        }
        if (str != null) {
            if (o.LJ(str, CardStruct.IStatusCode.DEFAULT) && length != 0) {
                ((UHL) aCListenerS30S0101000_13.l0).LJJIIZI(String.valueOf(aCListenerS30S0101000_13.i1));
                return;
            }
            LiveEditText liveEditText3 = ((UHL) aCListenerS30S0101000_13.l0).LJLL;
            if (liveEditText3 == null || (text = liveEditText3.getText()) == null) {
                return;
            }
            text.insert(length, String.valueOf(aCListenerS30S0101000_13.i1));
            return;
        }
        ((UHL) aCListenerS30S0101000_13.l0).LJJIIZI(String.valueOf(aCListenerS30S0101000_13.i1));
    }

    public static final void onClick$9(ACListenerS30S0101000_13 aCListenerS30S0101000_13, View view) {
        switch (aCListenerS30S0101000_13.i1) {
            case 0:
                ((C161416Vd) aCListenerS30S0101000_13.l0).LJIIJ();
                return;
            case 1:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS30S0101000_13.l0;
                User user = i18nSettingManageMyAccountActivity.LJLIL;
                if (C2YJ.LIZIZ.LIZ.getEnableEmailVerification().intValue() != 1) {
                    return;
                }
                String email = user.getEmail();
                if (!TextUtils.isEmpty(email)) {
                    i18nSettingManageMyAccountActivity.LLIZLLLIL(email, user.isEmailVerified());
                    return;
                }
                i18nSettingManageMyAccountActivity.LJLJI = true;
                Bundle bundle = new Bundle();
                bundle.putInt("email_source", V86.DYABindEmailSourceTypeAccountManagementEmail.getValue());
                bundle.putString("page", "add");
                HG3.LJFF().bindEmail(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LLIIIZ, "click_email", bundle, null);
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS30S0101000_13.l0).lambda$initUnits$68(view);
                return;
        }
    }

    public ACListenerS30S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
