package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;

/* renamed from: X.Owc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63534Owc extends AbstractC63515OwJ<C63120Opw> {
    public volatile boolean LIZJ;

    public C63534Owc(InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        super(EnumC63625Oy5.SET_CONVERSATION_SETTING_INFO.getValue(), interfaceC86963bA);
        this.LIZJ = false;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody;
        Integer num;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (setConversationSettingInfoResponseBody = responseBody.set_conversation_setting_info_body) != null && (num = setConversationSettingInfoResponseBody.status) != null && num.intValue() == EnumC63567Ox9.OP_SUCCEED.getValue() && c63622Oy2.LJLJL.body.set_conversation_setting_info_body.setting_info != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        Object[] objArr = c63622Oy2.LJLJJL;
        final String str = (String) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        final String str2 = (String) c63622Oy2.LJLJJL[2];
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            RunnableC63345OtZ.LJ(new C63117Opt(c63622Oy2.LJLJL.body.set_conversation_setting_info_body.setting_info, booleanValue), new InterfaceC63353Oth<C63120Opw>() { // from class: X.4nl
                @Override // X.InterfaceC63353Oth
                public final void LIZLLL(C63120Opw c63120Opw) {
                    C63120Opw c63120Opw2 = c63120Opw;
                    if (c63120Opw2 != null) {
                        C115284fk.LJIILIIL().LJIJI(5, c63120Opw2);
                        C63534Owc.this.LIZLLL(c63120Opw2);
                        C115064fO LJII = C63337OtR.LJII(c63622Oy2, true);
                        LJII.LIZJ.put("conversation_id", str);
                        LJII.LIZJ.put("keys", str2);
                        LJII.LIZ();
                    } else {
                        C63534Owc.this.LIZIZ(C63622Oy2.LIZJ(-3001));
                        C115064fO LJII2 = C63337OtR.LJII(c63622Oy2, false);
                        LJII2.LIZJ.put("conversation_id", str);
                        LJII2.LIZJ.put("keys", str2);
                        LJII2.LIZ();
                    }
                    aRunnableS29S0200000_10.run();
                }
            }, false);
            return;
        }
        if (!this.LIZJ) {
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            Integer num = c63622Oy2.LJLJL.status_code;
            LJIILIIL.getClass();
            if (C115284fk.LIZJ(num)) {
                C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
                int LJFF = c63622Oy2.LJFF();
                C63535Owd c63535Owd = new C63535Owd(this, c63622Oy2, aRunnableS29S0200000_10, str, str2);
                LJIILIIL2.getClass();
                C115284fk.LJIL(LJFF, c63535Owd, str);
                return;
            }
        }
        LJIILIIL(c63622Oy2, aRunnableS29S0200000_10, str, str2);
    }

    public final void LJIILIIL(C63622Oy2 c63622Oy2, Runnable runnable, String str, String str2) {
        LIZIZ(c63622Oy2);
        runnable.run();
        C115064fO LJII = C63337OtR.LJII(c63622Oy2, false);
        LJII.LIZJ.put("conversation_id", str);
        LJII.LIZJ.put("keys", str2);
        LJII.LIZ();
    }
}
