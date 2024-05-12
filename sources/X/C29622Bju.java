package X;

import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Bju, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29622Bju extends CQO<LinkMicBattleItemCard> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d3x;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        C76280Twi c76280Twi;
        List<? extends TeamUsersInfo> list;
        String str;
        String str2;
        String LIZ = C05170If.LIZ(this.LJIIJJI.LJII);
        long j = this.LJIIJJI.LJIILLIIL;
        MESSAGE message = this.LJIJJLI;
        int i = ((LinkMicBattleItemCard) message).msgType;
        if (i != 2) {
            if (i != 3) {
                if (i != 10) {
                    if (i != 20 || TextUtils.isEmpty(LIZ)) {
                        return null;
                    }
                    return C15380j0.LJIILL(R.string.kex, LIZ);
                }
                if (TextUtils.isEmpty(LIZ)) {
                    return null;
                }
                return C15380j0.LJIILL(R.string.keo, LIZ);
            }
            if (((LinkMicBattleItemCard) message).useSmokeCard != null && ((LinkMicBattleItemCard) message).useSmokeCard.anchorId == j) {
                Text text = ((LinkMicBattleItemCard) message).useSmokeCard.displayContent;
                if (text == null) {
                    return null;
                }
                String str3 = text.defaultPattern;
                String str4 = text.key;
                if (!TextUtils.isEmpty(str4)) {
                    str2 = C86881Y7x.LIZIZ().LIZ(str4);
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    str3 = str2;
                }
                return CXJ.LJI(str3, text, null);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("MatchType = ");
            LIZ2.append(C76265TwT.LJIILJJIL);
            C0NB.LJ("TeamMateComm", X1D.LIZIZ(LIZ2));
            if (((LinkMicBattleItemCard) this.LJIJJLI).useSmokeCard != null && C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2) {
                C0NB.LJ("TeamMateComm", "MatchType = TeamMatchccc ----1111");
                C76280Twi c76280Twi2 = C76265TwT.LIZ;
                if (c76280Twi2.LJIL != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("MatchType = TeamINFO = ");
                    LIZ3.append(c76280Twi2.LJIL.size());
                    C0NB.LJ("TeamMateComm", X1D.LIZIZ(LIZ3));
                }
                List<? extends TeamUsersInfo> list2 = c76280Twi2.LJIL;
                if (list2 != null && list2.size() > 0) {
                    for (TeamUsersInfo teamUsersInfo : c76280Twi2.LJIL) {
                        if (teamUsersInfo.userIds != null) {
                            HashSet hashSet = new HashSet(teamUsersInfo.userIds);
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("teammate public message = ");
                            LIZ4.append(hashSet);
                            LIZ4.append("anchorId = ");
                            LIZ4.append(j);
                            LIZ4.append("senderId = ");
                            LIZ4.append(((LinkMicBattleItemCard) this.LJIJJLI).useSmokeCard.anchorId);
                            C0NB.LJ("TeamMate", X1D.LIZIZ(LIZ4));
                            if (hashSet.contains(Long.valueOf(j)) && hashSet.contains(Long.valueOf(((LinkMicBattleItemCard) this.LJIJJLI).useSmokeCard.anchorId))) {
                                return new SpannableString(C15380j0.LJIILJJIL(R.string.mxk));
                            }
                        }
                    }
                }
            }
        }
        MESSAGE message2 = this.LJIJJLI;
        if (((LinkMicBattleItemCard) message2).useCriticalStrikeCard != null && ((LinkMicBattleItemCard) message2).useCriticalStrikeCard.anchorId == j) {
            Text text2 = ((LinkMicBattleItemCard) message2).useCriticalStrikeCard.displayContent;
            if (text2 == null) {
                return null;
            }
            String str5 = text2.defaultPattern;
            String str6 = text2.key;
            if (!TextUtils.isEmpty(str6)) {
                str = C86881Y7x.LIZIZ().LIZ(str6);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str5 = str;
            }
            return CXJ.LJI(str5, text2, null);
        }
        if (((LinkMicBattleItemCard) message2).useCriticalStrikeCard != null && C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2 && (c76280Twi = C76265TwT.LIZ) != null && (list = c76280Twi.LJIL) != null && list.size() > 0) {
            for (TeamUsersInfo teamUsersInfo2 : c76280Twi.LJIL) {
                if (teamUsersInfo2.userIds != null) {
                    HashSet hashSet2 = new HashSet(teamUsersInfo2.userIds);
                    if (hashSet2.contains(Long.valueOf(j)) && hashSet2.contains(Long.valueOf(((LinkMicBattleItemCard) this.LJIJJLI).useCriticalStrikeCard.anchorId))) {
                        return new SpannableString(C15380j0.LJIILJJIL(R.string.mxj));
                    }
                }
            }
        }
        return null;
    }

    @Override // X.CQO, X.CQL
    public final Text LJLI() {
        MESSAGE message = this.LJIJJLI;
        if (((LinkMicBattleItemCard) message).msgType == 2 && ((LinkMicBattleItemCard) message).useCriticalStrikeCard != null && ((LinkMicBattleItemCard) message).useCriticalStrikeCard.anchorId == this.LJIIJJI.LJIILLIIL) {
            return ((LinkMicBattleItemCard) message).useCriticalStrikeCard.displayContent;
        }
        if (((LinkMicBattleItemCard) message).msgType == 3 && ((LinkMicBattleItemCard) message).useSmokeCard != null && ((LinkMicBattleItemCard) message).useSmokeCard.anchorId == this.LJIIJJI.LJIILLIIL) {
            return ((LinkMicBattleItemCard) message).useSmokeCard.displayContent;
        }
        if (C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2) {
            return null;
        }
        return super.LJLI();
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        MESSAGE message = this.LJIJJLI;
        if (((LinkMicBattleItemCard) message).msgType == 10 || ((LinkMicBattleItemCard) message).msgType == 20) {
            return (User) B83.LIZ().LIZIZ().getCurrentUser();
        }
        return null;
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        if (LJLI() != null) {
            return true;
        }
        return false;
    }

    public C29622Bju(LinkMicBattleItemCard linkMicBattleItemCard) {
        super(linkMicBattleItemCard);
    }
}
