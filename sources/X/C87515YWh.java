package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.YWh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87515YWh extends C0BE {
    public final /* synthetic */ IMDatabase_Impl LIZIZ;

    @Override // X.C0BE
    public final void LJ() {
    }

    @Override // X.C0BE
    public final void LIZJ() {
        List<C0BX> list = this.LIZIZ.LJI;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ListProtector.get(this.LIZIZ.LJI, i).getClass();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87515YWh(IMDatabase_Impl iMDatabase_Impl) {
        super(34);
        this.LIZIZ = iMDatabase_Impl;
    }

    @Override // X.C0BE
    public final void LIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `FRIENDS_RELATION` (`SEC_UID` TEXT NOT NULL, `RELATION_TYPE` INTEGER NOT NULL, `CREATED_TIME` INTEGER NOT NULL, PRIMARY KEY(`SEC_UID`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `SIMPLE_USER` (`UID` TEXT NOT NULL, `SEC_UID` TEXT, `NICK_NAME` TEXT, `SIGNATURE` TEXT, `AVATAR_THUMB` TEXT, `FOLLOW_STATUS` INTEGER NOT NULL, `UNIQUE_ID` TEXT, `WEIBO_VERIFY` TEXT, `CUSTOM_VERIFY` TEXT, `ENTERPRISE_VERIFY_REASON` TEXT, `VERIFICATION_TYPE` TEXT, `REMARK_NAME` TEXT, `SORT_WEIGHT` TEXT, `INITIAL_LETTER` TEXT, `SHORT_ID` TEXT, `REMARK_PINYIN` TEXT, `REMARK_INITIAL` TEXT, `NICK_NAME_PINYIN` TEXT, `NICK_NAME_INITIAL` TEXT, `COMMERCE_USER_LEVEL` INTEGER, `COLUMN_CONTACT_NAME` TEXT, `COLUMN_CONTACT_NAME_PINYIN` TEXT, `COLUMN_CONTACT_NAME_INITIAL` TEXT, `COLUMN_USER_SHARE_STATUS` INTEGER, `USER_FRIEND_REC_TYPE` INTEGER, `USER_FRIEND_REC_TIME` INTEGER, `USER_FOLLOW_TIME` INTEGER, `BLOCK_STATUS` INTEGER, `MENTION_ENABLED` INTEGER NOT NULL DEFAULT 0, `COMMENT_MENTION_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `VIDEO_MENTION_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `VIDEO_TAG_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `QA_INVITE_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `FOLLOWER_STATUS` INTEGER NOT NULL DEFAULT 0, `ACCOUNT_TYPE` INTEGER, `FOLLOWER_COUNT` INTEGER NOT NULL DEFAULT 0, `FOLLOWING_COUNT` INTEGER NOT NULL DEFAULT 0, `INTERNAL_SHARE_HOLD_OUT_VERSION` INTEGER NOT NULL DEFAULT 0, `AVATAR_MEDIUM` TEXT, `WELCOME_MESSAGE_ENABLED` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`UID`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `RECENT_SHARE` (`ID` TEXT NOT NULL, `SHARE_TIME` INTEGER NOT NULL, `SEND_TIME` INTEGER NOT NULL, `CURR_UID` TEXT NOT NULL, `SHARE_TYPE` TEXT NOT NULL, PRIMARY KEY(`ID`, `CURR_UID`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `MAF_USER` (`UID` TEXT NOT NULL, `SEC_UID` TEXT, `NICK_NAME` TEXT, `SIGNATURE` TEXT, `AVATAR_THUMB` TEXT, `FOLLOW_STATUS` INTEGER NOT NULL, `UNIQUE_ID` TEXT, `WEIBO_VERIFY` TEXT, `CUSTOM_VERIFY` TEXT, `ENTERPRISE_VERIFY_REASON` TEXT, `VERIFICATION_TYPE` TEXT, `REMARK_NAME` TEXT, `SORT_WEIGHT` TEXT, `INITIAL_LETTER` TEXT, `SHORT_ID` TEXT, `REMARK_PINYIN` TEXT, `REMARK_INITIAL` TEXT, `NICK_NAME_PINYIN` TEXT, `NICK_NAME_INITIAL` TEXT, `COMMERCE_USER_LEVEL` INTEGER, `COLUMN_CONTACT_NAME` TEXT, `COLUMN_CONTACT_NAME_PINYIN` TEXT, `COLUMN_CONTACT_NAME_INITIAL` TEXT, `COLUMN_USER_SHARE_STATUS` INTEGER, `USER_FRIEND_REC_TYPE` INTEGER, `USER_FRIEND_REC_TIME` INTEGER, `REC_TYPE` TEXT, `RECOMMEND_REASON` TEXT, `USER_FOLLOW_TIME` INTEGER, `BLOCK_STATUS` INTEGER, `MENTION_ENABLED` INTEGER NOT NULL DEFAULT 0, `COMMENT_MENTION_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `VIDEO_MENTION_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `VIDEO_TAG_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `QA_INVITE_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `FOLLOWER_STATUS` INTEGER NOT NULL DEFAULT 0, `ACCOUNT_TYPE` INTEGER, `FOLLOWER_COUNT` INTEGER NOT NULL DEFAULT 0, `FOLLOWING_COUNT` INTEGER NOT NULL DEFAULT 0, `INTERNAL_SHARE_HOLD_OUT_VERSION` INTEGER NOT NULL DEFAULT 0, `AVATAR_MEDIUM` TEXT, `MUTUAL_RELATION` TEXT, `FRIEND_TYPE_STR` TEXT, `REQUEST_ID` TEXT, `SOCIAL_INFO` TEXT, `IS_PRIVATE_ACCOUNT` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`UID`))");
        c38451f7.LJJIJIIJI("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c38451f7.LJJIJIIJI("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0e004879a565543b4eee8d6aa86e7657')");
    }

    @Override // X.C0BE
    public final void LIZIZ(C38451f7 c38451f7) {
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `FRIENDS_RELATION`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `SIMPLE_USER`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `RECENT_SHARE`");
        c38451f7.LJJIJIIJI("DROP TABLE IF EXISTS `MAF_USER`");
        List<C0BX> list = this.LIZIZ.LJI;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ListProtector.get(this.LIZIZ.LJI, i).getClass();
            }
        }
    }

    @Override // X.C0BE
    public final void LIZLLL(C38451f7 c38451f7) {
        this.LIZIZ.LIZ = c38451f7;
        this.LIZIZ.LJIIL(c38451f7);
        List<C0BX> list = this.LIZIZ.LJI;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C0BX) ListProtector.get(this.LIZIZ.LJI, i)).LIZ(c38451f7);
            }
        }
    }

    @Override // X.C0BE
    public final void LJFF(C38451f7 c38451f7) {
        C25080ye.LIZ(c38451f7);
    }

    @Override // X.C0BE
    public final C0BF LJI(C38451f7 c38451f7) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("SEC_UID", new C25090yf(1, 1, "SEC_UID", "TEXT", null, true));
        hashMap.put("RELATION_TYPE", new C25090yf(0, 1, "RELATION_TYPE", "INTEGER", null, true));
        C25130yj c25130yj = new C25130yj("FRIENDS_RELATION", hashMap, UC7.LIZIZ(hashMap, "CREATED_TIME", new C25090yf(0, 1, "CREATED_TIME", "INTEGER", null, true), 0), new HashSet(0));
        C25130yj LIZ = C25130yj.LIZ(c38451f7, "FRIENDS_RELATION");
        if (!c25130yj.equals(LIZ)) {
            return new C0BF(false, C169696lJ.LIZJ("FRIENDS_RELATION(com.ss.android.ugc.aweme.im.sdk.common.data.manager.entity.FamiliarRelationEntity).\n Expected:\n", c25130yj, "\n Found:\n", LIZ));
        }
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put("UID", new C25090yf(1, 1, "UID", "TEXT", null, true));
        hashMap2.put("SEC_UID", new C25090yf(0, 1, "SEC_UID", "TEXT", null, false));
        hashMap2.put("NICK_NAME", new C25090yf(0, 1, "NICK_NAME", "TEXT", null, false));
        hashMap2.put("SIGNATURE", new C25090yf(0, 1, "SIGNATURE", "TEXT", null, false));
        hashMap2.put("AVATAR_THUMB", new C25090yf(0, 1, "AVATAR_THUMB", "TEXT", null, false));
        hashMap2.put("FOLLOW_STATUS", new C25090yf(0, 1, "FOLLOW_STATUS", "INTEGER", null, true));
        hashMap2.put("UNIQUE_ID", new C25090yf(0, 1, "UNIQUE_ID", "TEXT", null, false));
        hashMap2.put("WEIBO_VERIFY", new C25090yf(0, 1, "WEIBO_VERIFY", "TEXT", null, false));
        hashMap2.put("CUSTOM_VERIFY", new C25090yf(0, 1, "CUSTOM_VERIFY", "TEXT", null, false));
        hashMap2.put("ENTERPRISE_VERIFY_REASON", new C25090yf(0, 1, "ENTERPRISE_VERIFY_REASON", "TEXT", null, false));
        hashMap2.put("VERIFICATION_TYPE", new C25090yf(0, 1, "VERIFICATION_TYPE", "TEXT", null, false));
        hashMap2.put("REMARK_NAME", new C25090yf(0, 1, "REMARK_NAME", "TEXT", null, false));
        hashMap2.put("SORT_WEIGHT", new C25090yf(0, 1, "SORT_WEIGHT", "TEXT", null, false));
        hashMap2.put("INITIAL_LETTER", new C25090yf(0, 1, "INITIAL_LETTER", "TEXT", null, false));
        hashMap2.put("SHORT_ID", new C25090yf(0, 1, "SHORT_ID", "TEXT", null, false));
        hashMap2.put("REMARK_PINYIN", new C25090yf(0, 1, "REMARK_PINYIN", "TEXT", null, false));
        hashMap2.put("REMARK_INITIAL", new C25090yf(0, 1, "REMARK_INITIAL", "TEXT", null, false));
        hashMap2.put("NICK_NAME_PINYIN", new C25090yf(0, 1, "NICK_NAME_PINYIN", "TEXT", null, false));
        hashMap2.put("NICK_NAME_INITIAL", new C25090yf(0, 1, "NICK_NAME_INITIAL", "TEXT", null, false));
        hashMap2.put("COMMERCE_USER_LEVEL", new C25090yf(0, 1, "COMMERCE_USER_LEVEL", "INTEGER", null, false));
        hashMap2.put("COLUMN_CONTACT_NAME", new C25090yf(0, 1, "COLUMN_CONTACT_NAME", "TEXT", null, false));
        hashMap2.put("COLUMN_CONTACT_NAME_PINYIN", new C25090yf(0, 1, "COLUMN_CONTACT_NAME_PINYIN", "TEXT", null, false));
        hashMap2.put("COLUMN_CONTACT_NAME_INITIAL", new C25090yf(0, 1, "COLUMN_CONTACT_NAME_INITIAL", "TEXT", null, false));
        hashMap2.put("COLUMN_USER_SHARE_STATUS", new C25090yf(0, 1, "COLUMN_USER_SHARE_STATUS", "INTEGER", null, false));
        hashMap2.put("USER_FRIEND_REC_TYPE", new C25090yf(0, 1, "USER_FRIEND_REC_TYPE", "INTEGER", null, false));
        hashMap2.put("USER_FRIEND_REC_TIME", new C25090yf(0, 1, "USER_FRIEND_REC_TIME", "INTEGER", null, false));
        hashMap2.put("USER_FOLLOW_TIME", new C25090yf(0, 1, "USER_FOLLOW_TIME", "INTEGER", null, false));
        hashMap2.put("BLOCK_STATUS", new C25090yf(0, 1, "BLOCK_STATUS", "INTEGER", null, false));
        hashMap2.put("MENTION_ENABLED", new C25090yf(0, 1, "MENTION_ENABLED", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("COMMENT_MENTION_BLOCK_STATUS", new C25090yf(0, 1, "COMMENT_MENTION_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("VIDEO_MENTION_BLOCK_STATUS", new C25090yf(0, 1, "VIDEO_MENTION_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("VIDEO_TAG_BLOCK_STATUS", new C25090yf(0, 1, "VIDEO_TAG_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("QA_INVITE_BLOCK_STATUS", new C25090yf(0, 1, "QA_INVITE_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("FOLLOWER_STATUS", new C25090yf(0, 1, "FOLLOWER_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("ACCOUNT_TYPE", new C25090yf(0, 1, "ACCOUNT_TYPE", "INTEGER", null, false));
        hashMap2.put("FOLLOWER_COUNT", new C25090yf(0, 1, "FOLLOWER_COUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("FOLLOWING_COUNT", new C25090yf(0, 1, "FOLLOWING_COUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("INTERNAL_SHARE_HOLD_OUT_VERSION", new C25090yf(0, 1, "INTERNAL_SHARE_HOLD_OUT_VERSION", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap2.put("AVATAR_MEDIUM", new C25090yf(0, 1, "AVATAR_MEDIUM", "TEXT", null, false));
        C25130yj c25130yj2 = new C25130yj("SIMPLE_USER", hashMap2, UC7.LIZIZ(hashMap2, "WELCOME_MESSAGE_ENABLED", new C25090yf(0, 1, "WELCOME_MESSAGE_ENABLED", "INTEGER", CardStruct.IStatusCode.DEFAULT, true), 0), new HashSet(0));
        C25130yj LIZ2 = C25130yj.LIZ(c38451f7, "SIMPLE_USER");
        if (!c25130yj2.equals(LIZ2)) {
            return new C0BF(false, C169696lJ.LIZJ("SIMPLE_USER(com.ss.android.ugc.aweme.im.sdk.common.data.manager.entity.IMUserEntity).\n Expected:\n", c25130yj2, "\n Found:\n", LIZ2));
        }
        HashMap hashMap3 = new HashMap(5);
        hashMap3.put("ID", new C25090yf(1, 1, "ID", "TEXT", null, true));
        hashMap3.put("SHARE_TIME", new C25090yf(0, 1, "SHARE_TIME", "INTEGER", null, true));
        hashMap3.put("SEND_TIME", new C25090yf(0, 1, "SEND_TIME", "INTEGER", null, true));
        hashMap3.put("CURR_UID", new C25090yf(2, 1, "CURR_UID", "TEXT", null, true));
        C25130yj c25130yj3 = new C25130yj("RECENT_SHARE", hashMap3, UC7.LIZIZ(hashMap3, "SHARE_TYPE", new C25090yf(0, 1, "SHARE_TYPE", "TEXT", null, true), 0), new HashSet(0));
        C25130yj LIZ3 = C25130yj.LIZ(c38451f7, "RECENT_SHARE");
        if (!c25130yj3.equals(LIZ3)) {
            return new C0BF(false, C169696lJ.LIZJ("RECENT_SHARE(com.ss.android.ugc.aweme.im.sdk.common.data.manager.entity.RecentShareEntity).\n Expected:\n", c25130yj3, "\n Found:\n", LIZ3));
        }
        HashMap hashMap4 = new HashMap(46);
        hashMap4.put("UID", new C25090yf(1, 1, "UID", "TEXT", null, true));
        hashMap4.put("SEC_UID", new C25090yf(0, 1, "SEC_UID", "TEXT", null, false));
        hashMap4.put("NICK_NAME", new C25090yf(0, 1, "NICK_NAME", "TEXT", null, false));
        hashMap4.put("SIGNATURE", new C25090yf(0, 1, "SIGNATURE", "TEXT", null, false));
        hashMap4.put("AVATAR_THUMB", new C25090yf(0, 1, "AVATAR_THUMB", "TEXT", null, false));
        hashMap4.put("FOLLOW_STATUS", new C25090yf(0, 1, "FOLLOW_STATUS", "INTEGER", null, true));
        hashMap4.put("UNIQUE_ID", new C25090yf(0, 1, "UNIQUE_ID", "TEXT", null, false));
        hashMap4.put("WEIBO_VERIFY", new C25090yf(0, 1, "WEIBO_VERIFY", "TEXT", null, false));
        hashMap4.put("CUSTOM_VERIFY", new C25090yf(0, 1, "CUSTOM_VERIFY", "TEXT", null, false));
        hashMap4.put("ENTERPRISE_VERIFY_REASON", new C25090yf(0, 1, "ENTERPRISE_VERIFY_REASON", "TEXT", null, false));
        hashMap4.put("VERIFICATION_TYPE", new C25090yf(0, 1, "VERIFICATION_TYPE", "TEXT", null, false));
        hashMap4.put("REMARK_NAME", new C25090yf(0, 1, "REMARK_NAME", "TEXT", null, false));
        hashMap4.put("SORT_WEIGHT", new C25090yf(0, 1, "SORT_WEIGHT", "TEXT", null, false));
        hashMap4.put("INITIAL_LETTER", new C25090yf(0, 1, "INITIAL_LETTER", "TEXT", null, false));
        hashMap4.put("SHORT_ID", new C25090yf(0, 1, "SHORT_ID", "TEXT", null, false));
        hashMap4.put("REMARK_PINYIN", new C25090yf(0, 1, "REMARK_PINYIN", "TEXT", null, false));
        hashMap4.put("REMARK_INITIAL", new C25090yf(0, 1, "REMARK_INITIAL", "TEXT", null, false));
        hashMap4.put("NICK_NAME_PINYIN", new C25090yf(0, 1, "NICK_NAME_PINYIN", "TEXT", null, false));
        hashMap4.put("NICK_NAME_INITIAL", new C25090yf(0, 1, "NICK_NAME_INITIAL", "TEXT", null, false));
        hashMap4.put("COMMERCE_USER_LEVEL", new C25090yf(0, 1, "COMMERCE_USER_LEVEL", "INTEGER", null, false));
        hashMap4.put("COLUMN_CONTACT_NAME", new C25090yf(0, 1, "COLUMN_CONTACT_NAME", "TEXT", null, false));
        hashMap4.put("COLUMN_CONTACT_NAME_PINYIN", new C25090yf(0, 1, "COLUMN_CONTACT_NAME_PINYIN", "TEXT", null, false));
        hashMap4.put("COLUMN_CONTACT_NAME_INITIAL", new C25090yf(0, 1, "COLUMN_CONTACT_NAME_INITIAL", "TEXT", null, false));
        hashMap4.put("COLUMN_USER_SHARE_STATUS", new C25090yf(0, 1, "COLUMN_USER_SHARE_STATUS", "INTEGER", null, false));
        hashMap4.put("USER_FRIEND_REC_TYPE", new C25090yf(0, 1, "USER_FRIEND_REC_TYPE", "INTEGER", null, false));
        hashMap4.put("USER_FRIEND_REC_TIME", new C25090yf(0, 1, "USER_FRIEND_REC_TIME", "INTEGER", null, false));
        hashMap4.put("REC_TYPE", new C25090yf(0, 1, "REC_TYPE", "TEXT", null, false));
        hashMap4.put("RECOMMEND_REASON", new C25090yf(0, 1, "RECOMMEND_REASON", "TEXT", null, false));
        hashMap4.put("USER_FOLLOW_TIME", new C25090yf(0, 1, "USER_FOLLOW_TIME", "INTEGER", null, false));
        hashMap4.put("BLOCK_STATUS", new C25090yf(0, 1, "BLOCK_STATUS", "INTEGER", null, false));
        hashMap4.put("MENTION_ENABLED", new C25090yf(0, 1, "MENTION_ENABLED", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("COMMENT_MENTION_BLOCK_STATUS", new C25090yf(0, 1, "COMMENT_MENTION_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("VIDEO_MENTION_BLOCK_STATUS", new C25090yf(0, 1, "VIDEO_MENTION_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("VIDEO_TAG_BLOCK_STATUS", new C25090yf(0, 1, "VIDEO_TAG_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("QA_INVITE_BLOCK_STATUS", new C25090yf(0, 1, "QA_INVITE_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("FOLLOWER_STATUS", new C25090yf(0, 1, "FOLLOWER_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("ACCOUNT_TYPE", new C25090yf(0, 1, "ACCOUNT_TYPE", "INTEGER", null, false));
        hashMap4.put("FOLLOWER_COUNT", new C25090yf(0, 1, "FOLLOWER_COUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("FOLLOWING_COUNT", new C25090yf(0, 1, "FOLLOWING_COUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("INTERNAL_SHARE_HOLD_OUT_VERSION", new C25090yf(0, 1, "INTERNAL_SHARE_HOLD_OUT_VERSION", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
        hashMap4.put("AVATAR_MEDIUM", new C25090yf(0, 1, "AVATAR_MEDIUM", "TEXT", null, false));
        hashMap4.put("MUTUAL_RELATION", new C25090yf(0, 1, "MUTUAL_RELATION", "TEXT", null, false));
        hashMap4.put("FRIEND_TYPE_STR", new C25090yf(0, 1, "FRIEND_TYPE_STR", "TEXT", null, false));
        hashMap4.put("REQUEST_ID", new C25090yf(0, 1, "REQUEST_ID", "TEXT", null, false));
        hashMap4.put("SOCIAL_INFO", new C25090yf(0, 1, "SOCIAL_INFO", "TEXT", null, false));
        C25130yj c25130yj4 = new C25130yj("MAF_USER", hashMap4, UC7.LIZIZ(hashMap4, "IS_PRIVATE_ACCOUNT", new C25090yf(0, 1, "IS_PRIVATE_ACCOUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true), 0), new HashSet(0));
        C25130yj LIZ4 = C25130yj.LIZ(c38451f7, "MAF_USER");
        if (!c25130yj4.equals(LIZ4)) {
            return new C0BF(false, C169696lJ.LIZJ("MAF_USER(com.ss.android.ugc.aweme.im.sdk.common.data.manager.entity.MAFUserEntity).\n Expected:\n", c25130yj4, "\n Found:\n", LIZ4));
        }
        return new C0BF(true, null);
    }
}
