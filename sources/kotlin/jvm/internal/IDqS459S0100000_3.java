package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C113294cX;
import X.C177056xB;
import X.C212428Vi;
import X.C224748ru;
import X.C51029K0z;
import X.C6ZT;
import X.C72O;
import X.C76800UCe;
import X.C7AY;
import X.C7HL;
import X.C7HM;
import X.C7HV;
import X.C7IK;
import X.C7IZ;
import X.EnumC177736yH;
import X.InterfaceC88475Ynv;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;

/* loaded from: classes4.dex */
public class IDqS459S0100000_3 extends AbstractC65781Prl implements InterfaceC88475Ynv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88475Ynv
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS459S0100000_3(UpvoteVideoAssem upvoteVideoAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = upvoteVideoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS459S0100000_3(UpvoteVideoAssemNew upvoteVideoAssemNew, int i) {
        super(5);
        this.$t = i;
        this.l0 = upvoteVideoAssemNew;
    }

    public static final Object invoke$0(IDqS459S0100000_3 iDqS459S0100000_3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        String str2;
        User author;
        User author2;
        String str3;
        C7AY c7ay;
        C224748ru c224748ru;
        String str4;
        View v = (View) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        UpvoteStruct upvoteStruct = (UpvoteStruct) obj4;
        String clickMehod = (String) obj5;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(clickMehod, "clickMehod");
        if (!C6ZT.LIZ(v)) {
            if (intValue != 0) {
                String str5 = "";
                String str6 = null;
                if (intValue != 1) {
                    if (intValue == 2) {
                        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) iDqS459S0100000_3.l0)).getAweme();
                        o.LJIIIIZZ(aweme, "item.aweme");
                        String aid = aweme.getAid();
                        if (aid != null) {
                            C7IZ u4 = ((UpvoteVideoAssem) iDqS459S0100000_3.l0).u4();
                            if (u4 != null && u4.LJIIJ != null && (u4.LJIIIZ || ((AnimatorSet) u4.LJFF.getValue()).isRunning() || ((Animator) u4.LJII.getValue()).isRunning())) {
                                u4.LIZJ();
                            }
                            UpvoteVideoAssem upvoteVideoAssem = (UpvoteVideoAssem) iDqS459S0100000_3.l0;
                            upvoteVideoAssem.getClass();
                            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem)).getAweme();
                            if (aweme2 != null) {
                                str3 = aweme2.getAid();
                            } else {
                                str3 = null;
                            }
                            if (o.LJ(aid, str3)) {
                                if (!upvoteVideoAssem.LLILII && (c224748ru = upvoteVideoAssem.LLIILZL) != null) {
                                    upvoteVideoAssem.LLILII = true;
                                    Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem)).getAweme();
                                    if (aweme3 == null || (str4 = aweme3.getAid()) == null) {
                                        str4 = "";
                                    }
                                    String str7 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem)).mEventType;
                                    if (str7 != null) {
                                        str5 = str7;
                                    }
                                    Aweme aweme4 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem)).getAweme();
                                    if (aweme4 != null) {
                                        str6 = aweme4.getAuthorUid();
                                    }
                                    C177056xB c177056xB = new C177056xB(c224748ru, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, (TextView) null, str4, str5, (EnumC177736yH) null, str6, 768);
                                    C7AY c7ay2 = (C7AY) upvoteVideoAssem.LLIILII.getValue();
                                    if (c7ay2 != null) {
                                        c7ay2.LIZIZ(c177056xB);
                                    }
                                }
                                if (C72O.LIZ() && (c7ay = (C7AY) upvoteVideoAssem.LLIILII.getValue()) != null) {
                                    c7ay.LIZJ();
                                }
                                C7AY c7ay3 = (C7AY) upvoteVideoAssem.LLIILII.getValue();
                                if (c7ay3 != null) {
                                    c7ay3.LIZ();
                                }
                                ActivityC45651qj LIZ = C212428Vi.LIZ(upvoteVideoAssem);
                                if (LIZ != null) {
                                    C7HM.LJIIIZ(LIZ);
                                }
                            }
                        }
                    }
                } else {
                    Aweme aweme5 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) iDqS459S0100000_3.l0)).getAweme();
                    o.LJIIIIZZ(aweme5, "item.aweme");
                    String aid2 = aweme5.getAid();
                    if (aid2 != null) {
                        UpvoteVideoAssem upvoteVideoAssem2 = (UpvoteVideoAssem) iDqS459S0100000_3.l0;
                        upvoteVideoAssem2.A4().LJLJI.LIZIZ = true;
                        C7HV c7hv = C7HV.LIZIZ;
                        String eventType = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem2)).mEventType;
                        Aweme aweme6 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem2)).getAweme();
                        if (aweme6 == null || (author2 = aweme6.getAuthor()) == null || (str = author2.getUid()) == null) {
                            str = "";
                        }
                        Aweme aweme7 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssem2)).getAweme();
                        if (aweme7 == null || (author = aweme7.getAuthor()) == null || (str2 = Integer.valueOf(author.getFollowStatus()).toString()) == null) {
                            str2 = "";
                        }
                        String str8 = upvoteVideoAssem2.A4().LJLJI.LJIIL;
                        String str9 = upvoteVideoAssem2.A4().LJLJI.LJIILL;
                        if (str9 != null) {
                            str5 = str9;
                        }
                        boolean z = upvoteVideoAssem2.A4().LJLJI.LJIILJJIL;
                        o.LJIIIIZZ(eventType, "eventType");
                        C113294cX.LIZ(c7hv, aid2, new UpvotePublishMobParam(eventType, "button", aid2, str, str2, null, str8, null, z, str5, 736), null, null, null, false, null, null, false, 508);
                        if (!upvoteVideoAssem2.A4().LJLJI.LJIILJJIL) {
                            if (upvoteVideoAssem2.A4().LJLJI.LIZLLL) {
                                upvoteVideoAssem2.A4().LJLJI.getClass();
                                C7IK.LJFF(0);
                            } else if (upvoteVideoAssem2.A4().LJLJI.LIZJ) {
                                upvoteVideoAssem2.A4().LJLJI.getClass();
                                C7IK.LJII(0);
                            } else {
                                upvoteVideoAssem2.A4().LJLJI.getClass();
                                C7IK.LJI(C7IK.LIZLLL() + 1);
                            }
                        }
                    }
                }
            } else {
                DataCenter dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) iDqS459S0100000_3.l0)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.jv0(7, "upvote_bubble_click");
                }
            }
            if (intValue2 != 2) {
                if (intValue2 != 3) {
                    if (intValue2 == 4 && upvoteStruct != null) {
                        String str10 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) iDqS459S0100000_3.l0)).mEventType;
                        o.LJIIIIZZ(str10, "item.eventType");
                        C7HL.LIZJ("click", str10, ((UpvoteVideoAssem) iDqS459S0100000_3.l0).z4().LJLJJLL, upvoteStruct);
                    }
                } else {
                    String str11 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) iDqS459S0100000_3.l0)).mEventType;
                    o.LJIIIIZZ(str11, "item.eventType");
                    C7HL.LIZIZ("click", ((UpvoteVideoAssem) iDqS459S0100000_3.l0).z4().LJLJJLL, str11);
                }
            } else {
                String str12 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) iDqS459S0100000_3.l0)).mEventType;
                o.LJIIIIZZ(str12, "item.eventType");
                C7HL.LIZ("click", str12, clickMehod, ((UpvoteVideoAssem) iDqS459S0100000_3.l0).z4().LJLJJLL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS459S0100000_3 iDqS459S0100000_3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        String str2;
        User author;
        User author2;
        String str3;
        C7AY c7ay;
        C224748ru c224748ru;
        String str4;
        View v = (View) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        UpvoteStruct upvoteStruct = (UpvoteStruct) obj4;
        String clickMehod = (String) obj5;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(clickMehod, "clickMehod");
        if (!C6ZT.LIZ(v)) {
            if (intValue != 0) {
                String str5 = "";
                String str6 = null;
                if (intValue != 1) {
                    if (intValue == 2) {
                        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) iDqS459S0100000_3.l0)).getAweme();
                        o.LJIIIIZZ(aweme, "item.aweme");
                        String aid = aweme.getAid();
                        if (aid != null) {
                            UpvoteVideoAssemNew upvoteVideoAssemNew = (UpvoteVideoAssemNew) iDqS459S0100000_3.l0;
                            upvoteVideoAssemNew.getClass();
                            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew)).getAweme();
                            if (aweme2 != null) {
                                str3 = aweme2.getAid();
                            } else {
                                str3 = null;
                            }
                            if (o.LJ(aid, str3)) {
                                if (!upvoteVideoAssemNew.LLIL && (c224748ru = upvoteVideoAssemNew.LLIILZL) != null) {
                                    upvoteVideoAssemNew.LLIL = true;
                                    Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew)).getAweme();
                                    if (aweme3 == null || (str4 = aweme3.getAid()) == null) {
                                        str4 = "";
                                    }
                                    String str7 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew)).mEventType;
                                    if (str7 != null) {
                                        str5 = str7;
                                    }
                                    Aweme aweme4 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew)).getAweme();
                                    if (aweme4 != null) {
                                        str6 = aweme4.getAuthorUid();
                                    }
                                    C177056xB c177056xB = new C177056xB(c224748ru, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, (TextView) null, str4, str5, (EnumC177736yH) null, str6, 768);
                                    C7AY c7ay2 = (C7AY) upvoteVideoAssemNew.LLIILII.getValue();
                                    if (c7ay2 != null) {
                                        c7ay2.LIZIZ(c177056xB);
                                    }
                                }
                                if (C72O.LIZ() && (c7ay = (C7AY) upvoteVideoAssemNew.LLIILII.getValue()) != null) {
                                    c7ay.LIZJ();
                                }
                                C7AY c7ay3 = (C7AY) upvoteVideoAssemNew.LLIILII.getValue();
                                if (c7ay3 != null) {
                                    c7ay3.LIZ();
                                }
                                ActivityC45651qj LIZ = C212428Vi.LIZ(upvoteVideoAssemNew);
                                if (LIZ != null) {
                                    C7HM.LJIIIZ(LIZ);
                                }
                            }
                        }
                    }
                } else {
                    Aweme aweme5 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) iDqS459S0100000_3.l0)).getAweme();
                    o.LJIIIIZZ(aweme5, "item.aweme");
                    String aid2 = aweme5.getAid();
                    if (aid2 != null) {
                        UpvoteVideoAssemNew upvoteVideoAssemNew2 = (UpvoteVideoAssemNew) iDqS459S0100000_3.l0;
                        upvoteVideoAssemNew2.z4().LJLJI.LIZIZ = true;
                        C7HV c7hv = C7HV.LIZIZ;
                        String eventType = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew2)).mEventType;
                        Aweme aweme6 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew2)).getAweme();
                        if (aweme6 == null || (author2 = aweme6.getAuthor()) == null || (str = author2.getUid()) == null) {
                            str = "";
                        }
                        Aweme aweme7 = ((VideoItemParams) C51029K0z.LJIILLIIL(upvoteVideoAssemNew2)).getAweme();
                        if (aweme7 == null || (author = aweme7.getAuthor()) == null || (str2 = Integer.valueOf(author.getFollowStatus()).toString()) == null) {
                            str2 = "";
                        }
                        String str8 = upvoteVideoAssemNew2.z4().LJLJI.LJIIIIZZ;
                        String str9 = upvoteVideoAssemNew2.z4().LJLJI.LJIIJ;
                        if (str9 != null) {
                            str5 = str9;
                        }
                        boolean z = upvoteVideoAssemNew2.z4().LJLJI.LJIIIZ;
                        o.LJIIIIZZ(eventType, "eventType");
                        C113294cX.LIZ(c7hv, aid2, new UpvotePublishMobParam(eventType, "button", aid2, str, str2, null, str8, null, z, str5, 736), null, null, null, false, null, null, false, 508);
                        if (!upvoteVideoAssemNew2.z4().LJLJI.LJIIIZ) {
                            if (upvoteVideoAssemNew2.z4().LJLJI.LIZLLL) {
                                upvoteVideoAssemNew2.z4().LJLJI.getClass();
                                C7IK.LJFF(0);
                            } else if (upvoteVideoAssemNew2.z4().LJLJI.LIZJ) {
                                upvoteVideoAssemNew2.z4().LJLJI.getClass();
                                C7IK.LJII(0);
                            } else {
                                upvoteVideoAssemNew2.z4().LJLJI.getClass();
                                C7IK.LJI(C7IK.LIZLLL() + 1);
                            }
                        }
                    }
                }
            } else {
                DataCenter dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) iDqS459S0100000_3.l0)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.jv0(7, "upvote_bubble_click");
                }
            }
            if (intValue2 != 2) {
                if (intValue2 != 3) {
                    if (intValue2 == 4 && upvoteStruct != null) {
                        String str10 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) iDqS459S0100000_3.l0)).mEventType;
                        o.LJIIIIZZ(str10, "item.eventType");
                        C7HL.LIZJ("click", str10, ((UpvoteVideoAssemNew) iDqS459S0100000_3.l0).u4().LJLJJI, upvoteStruct);
                    }
                } else {
                    String str11 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) iDqS459S0100000_3.l0)).mEventType;
                    o.LJIIIIZZ(str11, "item.eventType");
                    C7HL.LIZIZ("click", ((UpvoteVideoAssemNew) iDqS459S0100000_3.l0).u4().LJLJJI, str11);
                }
            } else {
                String str12 = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) iDqS459S0100000_3.l0)).mEventType;
                o.LJIIIIZZ(str12, "item.eventType");
                C7HL.LIZ("click", str12, clickMehod, ((UpvoteVideoAssemNew) iDqS459S0100000_3.l0).u4().LJLJJI);
            }
        }
        return C76800UCe.LIZ;
    }
}
