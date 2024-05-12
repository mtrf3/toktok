package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import java.lang.reflect.Field;

/* renamed from: X.Oy2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63622Oy2 implements InterfaceC120234nj, Comparable<C63622Oy2> {
    public final long LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC63361Otp LJLJJI;
    public Object[] LJLJJL;
    public Request LJLJJLL;
    public Response LJLJL;
    public EP1 LJLJLJ;
    public AbstractC63515OwJ LJLJLLL;
    public int LJLL;
    public final long LJLLI = SystemClock.uptimeMillis();
    public long LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public long LJZ;
    public long LJZI;
    public String LJZL;
    public long LL;
    public volatile InterfaceC63557Owz LLD;

    public final long LIZLLL() {
        Long l;
        try {
            EnumC63625Oy5 fromValue = EnumC63625Oy5.fromValue(this.LJLJJLL.cmd.intValue());
            if (fromValue == null) {
                return -1000L;
            }
            if (fromValue == EnumC63625Oy5.SEND_MESSAGE) {
                return this.LJLJL.body.send_message_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.CREATE_CONVERSATION_V2) {
                return this.LJLJL.body.create_conversation_v2_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.ADD_CONVERSATION_PARTICIPANTS) {
                return this.LJLJL.body.conversation_add_participants_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.LJLJL.body.conversation_remove_participants_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.LJLJL.body.update_conversation_participant_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.SET_CONVERSATION_CORE_INFO) {
                return this.LJLJL.body.set_conversation_core_info_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.LJLJL.body.upsert_conversation_core_ext_info_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.SET_CONVERSATION_SETTING_INFO) {
                return this.LJLJL.body.set_conversation_setting_info_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.LJLJL.body.upsert_conversation_setting_ext_info_body.check_code.longValue();
            }
            EnumC63625Oy5 enumC63625Oy5 = EnumC63625Oy5.UPDATE_CONVERSATION_AUDIT_SWITCH;
            if (fromValue == enumC63625Oy5) {
                Long l2 = (Long) LJI(this.LJLJL.body.getExtension(enumC63625Oy5.getValue()), "check_code");
                if (l2 != null) {
                    return l2.longValue();
                }
                return 0L;
            }
            EnumC63625Oy5 enumC63625Oy52 = EnumC63625Oy5.SEND_CONVERSATION_APPLY;
            if (fromValue == enumC63625Oy52) {
                Long l3 = (Long) LJI(this.LJLJL.body.getExtension(enumC63625Oy52.getValue()), "check_code");
                if (l3 != null) {
                    return l3.longValue();
                }
                return 0L;
            }
            EnumC63625Oy5 enumC63625Oy53 = EnumC63625Oy5.ACK_CONVERSATION_APPLY;
            if (fromValue == enumC63625Oy53) {
                Long l4 = (Long) LJI(this.LJLJL.body.getExtension(enumC63625Oy53.getValue()), "check_code");
                if (l4 != null) {
                    return l4.longValue();
                }
                return 0L;
            }
            EnumC63625Oy5 enumC63625Oy54 = EnumC63625Oy5.CALL_VOIP;
            if (fromValue == enumC63625Oy54) {
                Long l5 = (Long) LJI(this.LJLJL.body.getExtension(enumC63625Oy54.getValue()), "check_code");
                if (l5 != null) {
                    return l5.longValue();
                }
                return 0L;
            }
            EnumC63625Oy5 enumC63625Oy55 = EnumC63625Oy5.BROADCAST_SEND_MESSAGE;
            if (fromValue == enumC63625Oy55) {
                Long l6 = (Long) LJI(this.LJLJL.body.getExtension(enumC63625Oy55.getValue()), "check_code");
                if (l6 != null) {
                    return l6.longValue();
                }
                return 0L;
            }
            if (fromValue == EnumC63625Oy5.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.LJLJL.body.previewer_get_conversation_info_list_body.check_code.longValue();
            }
            if (fromValue == EnumC63625Oy5.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                return this.LJLJL.body.previewer_messages_in_conversation_body.check_code.longValue();
            }
            EnumC63625Oy5 enumC63625Oy56 = EnumC63625Oy5.SEND_FRIEND_APPLY;
            if (fromValue == enumC63625Oy56 && (l = (Long) LJI(this.LJLJL.body.getExtension(enumC63625Oy56.getValue()), "check_code")) != null) {
                return l.longValue();
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final String LJ() {
        EnumC63625Oy5 fromValue;
        String str;
        try {
            fromValue = EnumC63625Oy5.fromValue(this.LJLJJLL.cmd.intValue());
        } catch (Exception unused) {
        }
        if (fromValue == null) {
            return "";
        }
        if (fromValue == EnumC63625Oy5.SEND_MESSAGE) {
            return this.LJLJL.body.send_message_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.CREATE_CONVERSATION_V2) {
            return this.LJLJL.body.create_conversation_v2_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.ADD_CONVERSATION_PARTICIPANTS) {
            return this.LJLJL.body.conversation_add_participants_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.REMOVE_CONVERSATION_PARTICIPANTS) {
            return this.LJLJL.body.conversation_remove_participants_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.UPDATE_CONVERSATION_PARTICIPANT) {
            return this.LJLJL.body.update_conversation_participant_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.SET_CONVERSATION_CORE_INFO) {
            return this.LJLJL.body.set_conversation_core_info_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_CORE_EXT_INFO) {
            return this.LJLJL.body.upsert_conversation_core_ext_info_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.SET_CONVERSATION_SETTING_INFO) {
            return this.LJLJL.body.set_conversation_setting_info_body.check_message;
        }
        if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
            return this.LJLJL.body.upsert_conversation_setting_ext_info_body.check_message;
        }
        EnumC63625Oy5 enumC63625Oy5 = EnumC63625Oy5.UPDATE_CONVERSATION_AUDIT_SWITCH;
        if (fromValue == enumC63625Oy5) {
            String str2 = (String) LJI(this.LJLJL.body.getExtension(enumC63625Oy5.getValue()), "check_message");
            if (str2 != null) {
                return str2;
            }
        } else {
            EnumC63625Oy5 enumC63625Oy52 = EnumC63625Oy5.SEND_CONVERSATION_APPLY;
            if (fromValue == enumC63625Oy52) {
                String str3 = (String) LJI(this.LJLJL.body.getExtension(enumC63625Oy52.getValue()), "check_message");
                if (str3 != null) {
                    return str3;
                }
            } else {
                EnumC63625Oy5 enumC63625Oy53 = EnumC63625Oy5.ACK_CONVERSATION_APPLY;
                if (fromValue == enumC63625Oy53) {
                    String str4 = (String) LJI(this.LJLJL.body.getExtension(enumC63625Oy53.getValue()), "check_message");
                    if (str4 != null) {
                        return str4;
                    }
                } else {
                    EnumC63625Oy5 enumC63625Oy54 = EnumC63625Oy5.CALL_VOIP;
                    if (fromValue == enumC63625Oy54) {
                        String str5 = (String) LJI(this.LJLJL.body.getExtension(enumC63625Oy54.getValue()), "check_message");
                        if (str5 != null) {
                            return str5;
                        }
                    } else {
                        EnumC63625Oy5 enumC63625Oy55 = EnumC63625Oy5.BROADCAST_SEND_MESSAGE;
                        if (fromValue == enumC63625Oy55) {
                            String str6 = (String) LJI(this.LJLJL.body.getExtension(enumC63625Oy55.getValue()), "check_message");
                            if (str6 != null) {
                                return str6;
                            }
                        } else {
                            if (fromValue == EnumC63625Oy5.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                                return this.LJLJL.body.previewer_get_conversation_info_list_body.check_message;
                            }
                            if (fromValue == EnumC63625Oy5.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                                return this.LJLJL.body.previewer_messages_in_conversation_body.check_message;
                            }
                            EnumC63625Oy5 enumC63625Oy56 = EnumC63625Oy5.SEND_FRIEND_APPLY;
                            if (fromValue == enumC63625Oy56 && (str = (String) LJI(this.LJLJL.body.getExtension(enumC63625Oy56.getValue()), "check_message")) != null) {
                                return str;
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    public final int LJFF() {
        Integer num;
        Request request = this.LJLJJLL;
        if (request != null && (num = request.cmd) != null) {
            return num.intValue();
        }
        return EnumC63625Oy5.IMCMD_NOT_USED.getValue();
    }

    public final String LJII() {
        Integer num;
        RequestBody requestBody;
        SendMessageRequestBody sendMessageRequestBody;
        Request request = this.LJLJJLL;
        if (request == null || (num = request.cmd) == null || EnumC63625Oy5.fromValue(num.intValue()) != EnumC63625Oy5.SEND_MESSAGE || (requestBody = this.LJLJJLL.body) == null || (sendMessageRequestBody = requestBody.send_message_body) == null) {
            return "";
        }
        return sendMessageRequestBody.client_message_id;
    }

    public final String LJIIIIZZ() {
        Response response = this.LJLJL;
        if (response == null) {
            return "";
        }
        return response.log_id;
    }

    public final int LJIIIZ() {
        EnumC63625Oy5 fromValue;
        Integer num;
        try {
            fromValue = EnumC63625Oy5.fromValue(this.LJLJJLL.cmd.intValue());
        } catch (Exception unused) {
        }
        if (fromValue == null) {
            return AbstractC63551Owt.LIZ;
        }
        if (fromValue == EnumC63625Oy5.SEND_MESSAGE) {
            return this.LJLJL.body.send_message_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.CREATE_CONVERSATION_V2) {
            return this.LJLJL.body.create_conversation_v2_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.ADD_CONVERSATION_PARTICIPANTS) {
            return this.LJLJL.body.conversation_add_participants_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.REMOVE_CONVERSATION_PARTICIPANTS) {
            return this.LJLJL.body.conversation_remove_participants_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.UPDATE_CONVERSATION_PARTICIPANT) {
            return this.LJLJL.body.update_conversation_participant_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.SET_CONVERSATION_CORE_INFO) {
            return this.LJLJL.body.set_conversation_core_info_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_CORE_EXT_INFO) {
            return this.LJLJL.body.upsert_conversation_core_ext_info_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.SET_CONVERSATION_SETTING_INFO) {
            return this.LJLJL.body.set_conversation_setting_info_body.status.intValue();
        }
        if (fromValue == EnumC63625Oy5.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
            return this.LJLJL.body.upsert_conversation_setting_ext_info_body.status.intValue();
        }
        EnumC63625Oy5 enumC63625Oy5 = EnumC63625Oy5.UPDATE_CONVERSATION_AUDIT_SWITCH;
        if (fromValue == enumC63625Oy5) {
            Integer num2 = (Integer) LJI(this.LJLJL.body.getExtension(enumC63625Oy5.getValue()), "status");
            if (num2 != null) {
                return num2.intValue();
            }
        } else {
            EnumC63625Oy5 enumC63625Oy52 = EnumC63625Oy5.SEND_CONVERSATION_APPLY;
            if (fromValue == enumC63625Oy52) {
                Integer num3 = (Integer) LJI(this.LJLJL.body.getExtension(enumC63625Oy52.getValue()), "status");
                if (num3 != null) {
                    return num3.intValue();
                }
            } else {
                EnumC63625Oy5 enumC63625Oy53 = EnumC63625Oy5.ACK_CONVERSATION_APPLY;
                if (fromValue == enumC63625Oy53) {
                    Integer num4 = (Integer) LJI(this.LJLJL.body.getExtension(enumC63625Oy53.getValue()), "status");
                    if (num4 != null) {
                        return num4.intValue();
                    }
                } else {
                    EnumC63625Oy5 enumC63625Oy54 = EnumC63625Oy5.CALL_VOIP;
                    if (fromValue == enumC63625Oy54) {
                        Integer num5 = (Integer) LJI(this.LJLJL.body.getExtension(enumC63625Oy54.getValue()), "status");
                        if (num5 != null) {
                            return num5.intValue();
                        }
                    } else {
                        EnumC63625Oy5 enumC63625Oy55 = EnumC63625Oy5.BROADCAST_SEND_MESSAGE;
                        if (fromValue == enumC63625Oy55) {
                            Integer num6 = (Integer) LJI(this.LJLJL.body.getExtension(enumC63625Oy55.getValue()), "status");
                            if (num6 != null) {
                                return num6.intValue();
                            }
                        } else {
                            if (fromValue == EnumC63625Oy5.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                                return this.LJLJL.body.previewer_get_conversation_info_list_body.status.intValue();
                            }
                            if (fromValue == EnumC63625Oy5.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                                return this.LJLJL.body.previewer_messages_in_conversation_body.status.intValue();
                            }
                            EnumC63625Oy5 enumC63625Oy56 = EnumC63625Oy5.SEND_FRIEND_APPLY;
                            if (fromValue == enumC63625Oy56 && (num = (Integer) LJI(this.LJLJL.body.getExtension(enumC63625Oy56.getValue()), "status")) != null) {
                                return num.intValue();
                            }
                        }
                    }
                }
            }
        }
        return AbstractC63551Owt.LIZ;
    }

    public final boolean LJIIJ() {
        Integer num;
        Response response = this.LJLJL;
        if (response != null && (num = response.status_code) != null && (num.intValue() == AbstractC63551Owt.LIZ || this.LJLJL.status_code.intValue() == 200)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestItem[cmd:");
        LIZ.append(LJFF());
        LIZ.append(", seqId:");
        return C0H1.LIZJ(LIZ, this.LJLIL, "]", LIZ);
    }

    public static C63622Oy2 LIZJ(int i) {
        C63622Oy2 c63622Oy2 = new C63622Oy2(-1L, null);
        c63622Oy2.LJLL = i;
        c63622Oy2.LJLJJI = null;
        return c63622Oy2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r7.LJFF() == r2.getValue()) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(X.C63622Oy2 r7) {
        /*
            r6 = this;
            X.Oy2 r7 = (X.C63622Oy2) r7
            boolean r0 = r6.equals(r7)
            r5 = 0
            if (r0 == 0) goto La
        L9:
            return r5
        La:
            int r1 = r6.LJFF()
            int r0 = r7.LJFF()
            if (r1 != r0) goto L21
        L14:
            long r3 = r6.LJLIL
            long r0 = r7.LJLIL
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L35
        L1f:
            r5 = 1
            goto L9
        L21:
            X.Oy5 r2 = X.EnumC63625Oy5.SEND_MESSAGE
            int r0 = r2.getValue()
            if (r1 != r0) goto L2a
            goto L37
        L2a:
            int r1 = r7.LJFF()
            int r0 = r2.getValue()
            if (r1 != r0) goto L14
            goto L1f
        L35:
            if (r0 >= 0) goto L9
        L37:
            r5 = -1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63622Oy2.compareTo(java.lang.Object):int");
    }

    public C63622Oy2(long j, AbstractC63515OwJ abstractC63515OwJ) {
        this.LJLIL = j;
        this.LJLJLLL = abstractC63515OwJ;
    }

    public static Object LJI(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }

    public final void LJIIJJI(int i, String str) {
        if (this.LJLJJLL != null) {
            C63653OyX c63653OyX = new C63653OyX();
            Request request = this.LJLJJLL;
            c63653OyX.LIZLLL = request.cmd;
            c63653OyX.LJII = request.inbox_type;
            c63653OyX.LJI = str;
            c63653OyX.LJ = Long.valueOf(this.LJLIL);
            c63653OyX.LJFF = Integer.valueOf(i);
            this.LJLJL = c63653OyX.build();
            this.LJLL = i;
        }
    }
}
